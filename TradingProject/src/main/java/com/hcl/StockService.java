package com.hcl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService implements StockServiceInterface {

	@Autowired
    private StockRepository stockRepository;

	@Override
    public List<Stock> findAll() {
        return (List<Stock>) stockRepository.findAll();
    }

	public List<Stock> save(Order product) {
		 return (List<Stock>) stockRepository.save();
		
	}
}
