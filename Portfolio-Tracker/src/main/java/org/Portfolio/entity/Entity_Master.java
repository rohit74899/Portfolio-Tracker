package org.Portfolio.entity;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Entity_Master")
public class Entity_Master {
	@Id
	@GeneratedValue(strategy  = GenerationType.SEQUENCE ,generator = "entity_master_seq" )
	@SequenceGenerator(name = "entity_master_seq"  ,sequenceName = "entity_master_seq" , allocationSize = 1)
	@Column(name = "user_id")
	Integer id;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "passwd")
	String password;
	
	@Column(name = "email")
	String email;
	
	@OneToMany(mappedBy="userid")
	//@OneToMany
	List<Portfolio_Txn> Portfolio_details;
	
	
	public List<Portfolio_Txn> getPortfolio(){
		return Portfolio_details;
	};
	
	public void setPortfolio(List<Portfolio_Txn> portfolio) {
		this.Portfolio_details=portfolio;
	}
	
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
	
	@Override
	public String toString() {
		return "User ["+this.id+ " "+this.username+" "+this.email+" "+this.password+"]";
	}
	
}
