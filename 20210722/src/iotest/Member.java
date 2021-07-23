package iotest;

import java.io.Serializable;

public class Member implements Serializable  {
	private int num;
	private String name;
	private String pw;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(int num, String name, String pw) {
		super();
		this.num = num;
		this.name = name;
		this.pw = pw;
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", pw=" + pw + "]";
	}
	
}
