package com.hcl.trade.service;

import java.util.List;

import com.hcl.trade.domain.Order;
import com.hcl.trade.exception.QuantityNotNullException;
import com.hcl.trade.exception.StockIdNotFoundException;
import com.hcl.trade.exception.UserIdNotFoundException;
import com.hcl.trade.model.Cart;

public interface CartService {

	List<Cart> displayByUserid(Integer userId) throws UserIdNotFoundException;

	String buyStock(Order order) throws StockIdNotFoundException, QuantityNotNullException;

}
