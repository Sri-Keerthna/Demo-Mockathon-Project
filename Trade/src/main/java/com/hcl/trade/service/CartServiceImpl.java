package com.hcl.trade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.trade.domain.Order;
import com.hcl.trade.exception.QuantityNotNullException;
import com.hcl.trade.exception.StockIdNotFoundException;
import com.hcl.trade.exception.UserIdNotFoundException;
import com.hcl.trade.model.Cart;
import com.hcl.trade.model.Stock;
import com.hcl.trade.repository.CartRepository;
import com.hcl.trade.repository.StockRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepository cartRepository;

	@Autowired
	StockRepository stockRepository;

	@Autowired
	StockServiceImpl stockService;

	public List<Cart> displayByUserid(Integer userId) throws UserIdNotFoundException {
		if (userId == 0) {
			throw new UserIdNotFoundException("user ID not found");
		}
		return cartRepository.findByUserId(userId);

	}

	@Transactional
	public String buyStock(Order order) throws StockIdNotFoundException, QuantityNotNullException {
		String result = "";
		Stock stock = stockService.getStockByStockId(order.getStockId());
		Cart cart = new Cart();
		Integer quantityAvailable = stock.getQuantity();
		Integer quantity = 0;
		Integer quantityOrder = order.getQuantity();
		if (quantityOrder == 0) {
			throw new QuantityNotNullException("Quantity can't be null");
		}
		if (quantityAvailable >= quantityOrder) {
			quantity = quantityAvailable - quantityOrder;
			stock.setQuantity(quantity);
			Double totalAmount = 0.0;
			Double unitPrice = stock.getPrice();
			Float brokeragePrice = stock.getBrokerage();
			totalAmount = (unitPrice * quantityOrder) + ((unitPrice * quantityOrder * brokeragePrice) / 100);
			cart.setTotalPrice(totalAmount);
			cart.setStockId(order.getStockId());
			cart.setStockName(stock.getStockName());
			cart.setUserId(order.getUserId());
			cart.setQuantityOrder(order.getQuantity());
			cartRepository.save(cart);
			stockService.saveStock(stock);
			result = "Order applied";
		} else {
			result = "Quantity not available";
		}
		return result;

	}

}
