package top.vabook.domain;
/**
* @author vabook@163.com
* 
*
*/

import java.sql.Date;

public class Product {
	private String pid;		//商品编号
	private String pname;	//商品名称
	private double market_price;	//市场价格
	private double shop_price;	//商城价格
	private String pimage;	//图片地址
	private Date pDate;	//上架日期
	private int is_hot;	//是否热门
	private int pflag;	//是否在架
	private String cid; //分类id
	
	
	public Product(String pid, String pname, double market_price, double shop_price, String pimage, Date pDate,
			int is_hot, int pflag, String cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.market_price = market_price;
		this.shop_price = shop_price;
		this.pimage = pimage;
		this.pDate = pDate;
		this.is_hot = is_hot;
		this.pflag = pflag;
		this.cid = cid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	public double getShop_price() {
		return shop_price;
	}
	public void setShop_price(double shop_price) {
		this.shop_price = shop_price;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	public int getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}
	public int getPflag() {
		return pflag;
	}
	public void setPflag(int pflag) {
		this.pflag = pflag;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", market_price=" + market_price + ", shop_price="
				+ shop_price + ", pimage=" + pimage + ", pDate=" + pDate + ", is_hot=" + is_hot + ", pflag=" + pflag
				+ ", cid=" + cid + "]";
	}
	
	
	

}
