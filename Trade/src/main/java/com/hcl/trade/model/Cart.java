package com.hcl.trade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@Column
	private Integer userId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer buyId;
	@Column
	private String stockName;
	@Column
	private Integer quantityOrder;
	@Column
	private double totalPrice;
	@Column
	private Integer stockId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBuyId() {
		return buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Integer getQuantityOrder() {
		return quantityOrder;
	}

	public void setQuantityOrder(Integer quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

}