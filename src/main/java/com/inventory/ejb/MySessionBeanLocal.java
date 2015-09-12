/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.ejb;

import Inventory.Inc.Product;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author A7mady
 */
@Local
@Stateless
public interface MySessionBeanLocal {
    public List<Product> getAllProducts();
    public String say(String word);
}
