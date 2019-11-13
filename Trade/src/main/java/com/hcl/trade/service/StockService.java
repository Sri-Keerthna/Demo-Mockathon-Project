package com.hcl.trade.service;

import java.util.List;

import com.hcl.trade.exception.StockIdNotFoundException;
import com.hcl.trade.model.Stock;

public interface StockService {

	List<Stock> displayStocks();

	boolean saveStock(Stock stock);

	Stock getStockByStockId(Integer stockId) throws StockIdNotFoundException;
}
