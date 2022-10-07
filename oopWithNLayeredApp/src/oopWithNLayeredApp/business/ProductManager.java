package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers; 
	
	public ProductManager(ProductDao productDao , Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) {
		
		// buraya iş kuralları yazılır
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
		
	}
}
