package com.hcl.trade.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.trade.model.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

	List<Stock> findAll();

	public Stock getStockByStockId(Integer stockId);
}
