package com.portfolio.app;

import org.springframework.stereotype.Component;

@Component
public class Portfolio_Txn {

	int Txn_id;
	
	Entity_Master userid;//Referencing to Entity Master
	

	String symbol;
	

	int quantity;
	

	int buyprice;
	
	public void set_Txn_id(int Txn_id) {
		this.Txn_id = Txn_id;
	}
	
	public int get_Txn_id() {
		return this.Txn_id;
	}
	
	public Entity_Master get_userid() {
		return this.userid;
	}
	
	public void set_userid(Entity_Master userid) {
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
	
	public void getportfolio() {
		System.out.println("Fetching Portfolio");
	}
	@Override
	public String toString() {
		return " "+this.Txn_id+ " "+this.symbol+" "+this.quantity+""+this.buyprice+" ";
	}
	
}
