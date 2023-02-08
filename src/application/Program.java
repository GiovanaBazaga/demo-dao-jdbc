package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//injeção de dependêcia
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== 1º TEST: Seller find by ID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
