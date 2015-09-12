/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Inventory.Inc.Product;
import Inventory.Inc.StockedProduct;
import com.inventory.ejb.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

/**
 *
 * @author A7mady
 */
public class EJBDAO {

    private Session session;

    public EJBDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void getAllProducts() {
        Criteria productCriteria = session.createCriteria(Product.class, "product");
        List list = productCriteria.list();
        for (Object list1 : list) {
            Product pr = (Product) list1;
            System.out.println(pr.getName());
        }
    }

    public void getStocksWhereNoProduct(String productName) {
        Criteria criteria = session.createCriteria(StockedProduct.class, "sp")
                .createAlias("sp.product", "pr")
                .add(Restrictions.eq("amount", 10))
                .add(Restrictions.eq("pr.name", productName));
        List list = criteria.list();
        for (Object list1 : list) {
            StockedProduct st = (StockedProduct) list1;
            System.out.println(st.getStock().getStockName());
            System.out.println(st.getProduct().getName() + "price " + st.getProduct().getPrice());
        }
    }

    public void getAmountOfProductInDifferentStocks() {

        Criteria criteria = session.createCriteria(StockedProduct.class, "sp")
                .createAlias("sp.product", "pr")
                .add(Restrictions.eq("pr.name", "laban"))
                .setProjection((Projections.sum("amount")));
       Long resultCount = (Long)criteria.uniqueResult();
        System.out.println(resultCount);
    }

}
