package com.hcl.trade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	private Integer stockId;
	@Column
	private String stockName;
	@Column
	private Integer quantity;
	@Column
	private double price;
	@Column
	private float brokerage;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(float brokerage) {
		this.brokerage = brokerage;
	}

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int i, int j, int k, int l, String string) {
		super();
		// TODO Auto-generated constructor stub
	}

}
