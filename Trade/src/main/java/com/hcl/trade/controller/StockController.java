package com.hcl.trade.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.trade.model.Stock;
import com.hcl.trade.service.StockServiceImpl;

@RestController
@RequestMapping("/stocks")
public class StockController {

	private static final Logger logger = Logger.getLogger(StockController.class);

	@Autowired
	StockServiceImpl stockService;

	@RequestMapping(value = "/allStocks", method = RequestMethod.GET)
	public ResponseEntity<List<Stock>> getAllStocks() {
		List<Stock> stockList = stockService.displayStocks();
		if (stockList.isEmpty()) {
			logger.info("Stocks are not there");
			return new ResponseEntity<List<Stock>>(stockList, HttpStatus.NOT_FOUND);
		}
		logger.info("Displaying all stocks");
		return new ResponseEntity<List<Stock>>(stockList, HttpStatus.OK);

	}
}