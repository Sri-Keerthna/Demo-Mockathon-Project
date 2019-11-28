package com.hcl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController 
public class StockController {

	@Autowired
	StockService stockService;
	
	@RequestMapping("/")
	public ModelAndView home(ModelAndView model) {
		model.addObject("stock",new Stock());
		model.setViewName("home");
		return model;
	}
	
	 @RequestMapping("/getAllStocks")
	    public ModelAndView getStockList(ModelAndView model) {
		 model.addObject("stockList", (List<Stock> )stockService.findAll());
		 model.setViewName("DisplayStock");
	        return model;
	    }
	 
	 @RequestMapping("/buyStock")
	    public ModelAndView buyProduct(ModelAndView model, @ModelAttribute Stock stock) {
		 List<Stock> stockList=stockService.getUserid();
		 User users = new User();
		 users.getUserid(stock.setUserid(users));
				 model.setViewName("buy");
				 return model;
	        
	    }
	 
	 @RequestMapping(value="/saveBuy",method = RequestMethod.POST)    
	    public String saveBuy(@ModelAttribute("order") Order order){    
		 stockService.save(order);    
	        return "redirect:/buyStock";   
	    }    
	 @RequestMapping("/getStockById")
	    public ModelAndView getStockbyID(ModelAndView model, @ModelAttribute User user) {
				 model.setViewName("StockById");
		 return model;
	    }
}
