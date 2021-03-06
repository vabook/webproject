package top.vabook.domain;
/**
* @author vabook@163.com
* 
*
*/

import com.mysql.fabric.xmlrpc.base.Data;

public class User {
	private String uid;	//用户id
	private String username;//用户账户名
	private String password;//用户密码
	private String name;//用户昵称
	private String email;//用户邮箱
	private String telephone;//用户电话
	private Data birthday;// 用户生日
	private String sex;	//用户性别
	private int state;
	private String code; //激活码
	
	

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public User(String uid, String username, String password, String name, String email, String telephone,
			Data birthday, String sex, int state, String code) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.birthday = birthday;
		this.sex = sex;
		this.state = state;
		this.code = code;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Data getBirthday() {
		return birthday;
	}
	public void setBirthday(Data birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", name=" + name + ", email="
				+ email + ", telephone=" + telephone + ", birthday=" + birthday + ", sex=" + sex + ", state=" + state
				+ ", code=" + code + "]";
	}

	
	
	
	
}
