package com.portfolio.app;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Entity_Master {
	
	Integer id;
	
	
	String username;
	
	
	String password;
	
	
	String email;
	
	@Autowired
	Portfolio_Txn pt;
	public Integer get_id() {
		return this.id;
	}
	
	public void set_id(Integer id) {
		this.id = id;
	}
	
	public String get_username() {
		return this.username;
	}
	
	public void set_username(String username) {
		this.username = username;
	}
	
	public String get_password() {
		return this.password;
	}
	
	public void set_password(String password) {
		this.password = password;
	}
	
	public String get_email() {
		return this.email;
	}
	
	public void set_email(String email) {
		this.email = email;
	}
	
	public void Code() {
		pt.getportfolio();
		
	}
	@Override
	public String toString() {
		return "User ["+this.id+ " "+this.username+" "+this.email+" "+this.password+" "+"]";
	}
	
}
