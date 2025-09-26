package org.Portfolio.dto;

import org.Portfolio.entity.Entity_Master;

public class PortfolioTxnDTO {

	int Txn_id;

	String symbol;

	int quantity;

	int buyprice;
	
	public void set_Txn_id(int Txn_id) {
		this.Txn_id = Txn_id;
	}
	
	public Integer Get_Txn_id() {
		return this.Txn_id;
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
		return " "+this.Txn_id+ " "+this.symbol+" "+this.quantity+""+this.buyprice+" ";
	}
}
