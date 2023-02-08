package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== 1º TEST: Seller find by ID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("=== 2º TEST: Seller find by Department ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("=== 3º TEST: Seller find by Department ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== 4º TEST: Seller insert ===");
		Seller newSeller = new Seller(null, "Ana Vitória", "aninhav@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New seller ID's = " + newSeller.getId());
		
	}

}
