package com.briup.apps.sms.bean;
/**
 * 校园信息
 * */
public class School {
	private Long id;
	private String realname;
	private String telephone;
	private String password;
	private String student_no;
	private String gender;
	private String clazz_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

}
