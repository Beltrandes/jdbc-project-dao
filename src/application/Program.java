package application;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        var sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST: 1 seller findById ===");
        var seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println("\n=== TEST: 2 seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== TEST: 3 seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
