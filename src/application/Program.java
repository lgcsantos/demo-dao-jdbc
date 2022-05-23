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
		
		System.out.println("=== TEST 1: seller fingById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);	
		
		System.out.println("\n=== TEST 2: seller fingByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.finfByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n=== TEST 3: seller fingAll ====");
		 list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n=== TEST 4: seller fingAll ====");
		Seller newSller = new Seller(null, "Nilton", "nilton.tadeu@gmail.com", new Date(), 15000.0, department);
		sellerDao.insert(newSller);
	    System.out.println("Inserted! New Id = " + newSller.getId());
		
	}
}
