package com.hcl.trade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.trade.model.Stock;
import com.hcl.trade.repository.StockRepository;
import com.hcl.trade.service.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
class TradeApplicationTests {

	@Autowired
	private StockService stockService;

	@MockBean
	private StockRepository stockRepository;

	@Test
	public void displayStocks() {
		when(stockRepository.findAll())
				.thenReturn(Stream.of(new Stock(110, 200, 4000000, 20, "Ashok")).collect(Collectors.toList()));
		assertEquals(1, stockService.displayStocks().size());
	}

}
