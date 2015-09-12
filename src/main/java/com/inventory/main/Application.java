package com.inventory.main;


import com.inventory.ejb.HibernateUtil;
import DAO.EJBDAO;
import Inventory.Inc.Product;
import Inventory.Inc.Stock;
import Inventory.Inc.StockedProduct;
import Inventory.Inc.StockedProductId;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A7mady
 */
public class Application {
    public static void main(String arg[]){
     
      new EJBDAO().getAllProducts();
      
        //new EJBDAO().getStocksWhereNoProduct("laban");
       // new EJBDAO().getAmountOfProductInDifferentStocks();
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Stock s = new Stock();
//        s.setStockName("stock1");
//        Product p=new Product();
//        p.setName("laban1");
//        p.setPrice(30.0);
////        StockedProductId pk=new StockedProductId();
////        pk.setProductId(1);
////        pk.setStockId(14); 
////        StockedProduct sp=new StockedProduct();
////        sp.setId(pk);
////        sp.setAmount(10);
//        Transaction tx = session.beginTransaction();
//        session.save(s);
//        session.save(p);
//       // session.save(sp);
//        tx.commit();
    }
}
