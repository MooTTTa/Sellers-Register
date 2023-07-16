package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("========== TEST 1: Seller findById ==========");
        Seller seller = sellerDao.findById(4);
        System.out.println(seller);

        System.out.println("========== TEST 2: Seller findByIdDepartment ==========");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("========== TEST 3: Seller findByIdAll ==========");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("========== TEST 4: Seller insert ==========");
        Seller newSeller = new Seller(13,"greg", "greg.com", new Date(), 4000.0, new Department(2,null));
        sellerDao.insert(newSeller);
        System.out.println("iNSERT ID " + newSeller.getId());

        System.out.println("========== TEST 5: Seller update ==========");
        Seller seller2 = sellerDao.findById(2);
        seller2.setName("WINE nn2131");
        sellerDao.update(seller2);
        System.out.println("update ok ");

        System.out.println("========== TEST 6: Seller delete by id ==========");
        sellerDao.deleteById(20);
        System.out.println("delete ok "); */

        System.out.println("========== TEST 1: Department insert ==========");


        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: insert =======");
        Department newDepartment = new Department(99, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: update =======");
        Department dep2 = departmentDao.findById(6);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
