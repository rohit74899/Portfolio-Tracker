package org.Portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Entity_Master")
public class Entity_Master {
	@Id
	@Column(name = "user_id")
	int id;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "passwd")
	String password;
	
	@Column(name = "email")
	String email;
	
	
	public int get_id() {
		return this.id;
	}
	
	public void set_id(int id) {
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
	
	@Override
	public String toString() {
		return "User ["+this.id+ " "+this.username+" "+this.email+" "+this.password+"]";
	}
	
}
