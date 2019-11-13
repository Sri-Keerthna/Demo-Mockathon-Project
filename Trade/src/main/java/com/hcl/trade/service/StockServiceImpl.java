package com.hcl.trade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.trade.exception.StockIdNotFoundException;
import com.hcl.trade.model.Stock;
import com.hcl.trade.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;

	public List<Stock> displayStocks() {
		return stockRepository.findAll();

	}

	public boolean saveStock(Stock stock) {
		stockRepository.save(stock);
		return true;
	}

	public Stock getStockByStockId(Integer stockId) throws StockIdNotFoundException {
		Stock stock = stockRepository.getStockByStockId(stockId);
		if (stock == null) {
			throw new StockIdNotFoundException("StockId Not Found");
		}
		return stock;
	}
}
