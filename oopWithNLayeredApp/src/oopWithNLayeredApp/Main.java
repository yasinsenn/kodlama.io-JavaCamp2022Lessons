package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Iphone XR", 15000);
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
