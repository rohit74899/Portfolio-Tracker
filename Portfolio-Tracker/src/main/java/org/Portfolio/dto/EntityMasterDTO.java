package org.Portfolio.dto;

import java.util.ArrayList;
import java.util.List;


public class EntityMasterDTO {

	Integer id;

	String username;

	String password;

	String email;

	List<PortfolioTxnDTO> Portfolio_details=new ArrayList<>();
	
	
	public List<PortfolioTxnDTO> getPortfolio(){
		return Portfolio_details;
	};
	
	public void setPortfolio(List<PortfolioTxnDTO> portfolio) {
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
		return "User ["+this.id+ " "+this.username+" "+this.email+" "+this.password+" "+this.Portfolio_details+"]";
	}
	
}
