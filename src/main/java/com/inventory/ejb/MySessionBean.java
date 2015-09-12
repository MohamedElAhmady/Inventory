/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.ejb;

import Inventory.Inc.Product;
import com.inventory.ejb.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.PrePersist;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author A7mady
 */
@Stateless
@LocalBean
public class MySessionBean   {
    public List<Product> getAllProducts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria productCriteria = session.createCriteria(Product.class, "product");
        List list = productCriteria.list();
        List <Product> productList = new ArrayList<>();
        for (Object list1 : list) {
            Product pr = (Product) list1;
            productList.add(pr);
        }
        return productList;
    }
    
    
    public String say(String word){
        return word;
    }


}
