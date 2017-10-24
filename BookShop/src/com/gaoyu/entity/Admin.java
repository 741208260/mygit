package com.gaoyu.entity;

/**
 * creat by gaoyu 2017-9-27
 */
public class Admin {
	int p_id = 0;
	String p_name = "";
	String p_pwd = "";
	float p_tel = 0;
	String p_addr = "";

	public Admin() {

	}

	public Admin(int p_id, String p_name, String p_pwd, float p_tel, String p_addr) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_pwd = p_pwd;
		this.p_tel = p_tel;
		this.p_addr = p_addr;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_pwd() {
		return p_pwd;
	}

	public void setP_pwd(String p_pwd) {
		this.p_pwd = p_pwd;
	}

	public float getP_tel() {
		return p_tel;
	}

	public void setP_tel(float p_tel) {
		this.p_tel = p_tel;
	}

	public String getP_addr() {
		return p_addr;
	}

	public void setP_addr(String p_addr) {
		this.p_addr = p_addr;
	}

	@Override
	public String toString() {
		return "Admin [p_id=" + p_id + ", p_name=" + p_name + ", p_pwd="
				+ p_pwd + ", p_tel=" + p_tel + ", p_addr=" + p_addr + "]";
	}

}
