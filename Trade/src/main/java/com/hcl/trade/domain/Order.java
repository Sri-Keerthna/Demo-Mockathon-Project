package com.hcl.trade.domain;

public class Order {

	private Integer userId;

	private Integer stockId;

	private Integer quantity;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
