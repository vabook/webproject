package top.vabook.web.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.collections.set.MapBackedSet;


/**
* @author vabook@163.com
*
*/
public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		chain.doFilter(new MyResquest(request), response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
class MyResquest extends HttpServletRequestWrapper{

	private HttpServletRequest request;
	private boolean flag = true;
	
	public MyResquest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	@Override
	public String getParameter(String name) {
		if (name == null || name.trim().length() == 0) {
			return null;
		}
		String[] values = getParameterValues(name);
		
		if (values == null || values.length == 0) {
			return null;
		}
		return values[0];
	}
	
	@Override
	public String[] getParameterValues(String name) {
		if (name == null || name.trim().length() == 0) {
			return null;
		}
		Map<String , String[]> map = getParameterMap();
		
		if (map == null || map.size() == 0) {
			return null;
		}
		return map.get(name);
	}
	
	@Override
	public Map<String, String[]> getParameterMap() {
		String method = request.getMethod();
		if ("post".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("utf-8");
				return request.getParameterMap();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}else if ("get".equalsIgnoreCase(method)) {
			Map<String, String[]> map = request.getParameterMap();
			if (flag) {
				for(String key : map.keySet()) {
					String arr[] = map.get(key);
					for(int i = 0 ; i < arr.length ; i ++) {
						try {
							arr[i] = new String(arr[i].getBytes("iso-8859-1"), "utf-8");
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
				}
				flag = false;
			}
			return map;
		}
		return super.getParameterMap();
	}
	
}
