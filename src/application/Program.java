package application;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        var obj = new Department(1, "Books");

        var seller = new Seller(1, "Beltrandes", "beltrandes@gmail.com", new Date(), 3000.0, obj);

        var sellerDao = DaoFactory.createSellerDao();
    }
}
