package org.Portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PORTFOLIO_TXN")
public class Portfolio_Txn {
	@Id
	@Column(name = "pt_id")
	int Txn_id;
	
	@Column(name = "pt_user_id")
	int userid;
	
	@Column(name = "pt_symbol")
	String symbol;
	
	@Column(name = "pt_quantity")
	int quantity;
	
	@Column(name = "pt_buy_price")
	int buyprice;
	
	public void set_Txn_id(int Txn_id) {
		this.Txn_id = Txn_id;
	}
	
	public int get_userid() {
		return this.userid;
	}
	
	public void set_userid(int userid) {
		this.userid = userid;
	}
	
	public String get_symbol() {
		return this.symbol;
	}
	
	public void set_symbol(String symbol) {
		this.symbol = symbol;
	}
	
	public int get_quantity() {
		return this.quantity;
	}
	
	public void set_quantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int get_buyPirce() {
		return this.buyprice;
	}
	
	public void set_buyPrice(int buyprice) {
		this.buyprice = buyprice;
	}
	@Override
	public String toString() {
		return "User ["+this.Txn_id+ " "+this.userid+" "+this.symbol+" "+this.quantity+""+this.buyprice+"]";
	}
	
}
