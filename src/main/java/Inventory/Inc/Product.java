package Inventory.Inc;
// Generated Sep 11, 2015 11:47:32 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer productId;
     private String name;
     private Double price;
     private Set stockedProducts = new HashSet(0);

    public Product() {
    }

	
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, Double price, Set stockedProducts) {
       this.name = name;
       this.price = price;
       this.stockedProducts = stockedProducts;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Set getStockedProducts() {
        return this.stockedProducts;
    }
    
    public void setStockedProducts(Set stockedProducts) {
        this.stockedProducts = stockedProducts;
    }




}

