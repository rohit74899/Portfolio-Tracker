package org.Portfolio.entity;

public class Portfolio_Txn {
	int Txn_id;
	int userid;
	String symbol;
	int quantity;
	int buyprice;

	public int get_Txn_id() {
		return this.Txn_id;
	}
	
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
	
	@Override
	public String toString() {
		return "User ["+this.Txn_id+ " "+this.userid+" "+this.symbol+" "+this.quantity+""+this.buyprice+"]";
	}
	
}
