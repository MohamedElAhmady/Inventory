package Inventory.Inc;
// Generated Sep 11, 2015 11:47:32 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private Integer stockId;
     private String stockName;
     private Set stockedProducts = new HashSet(0);

    public Stock() {
    }

	
    public Stock(String stockName) {
        this.stockName = stockName;
    }
    public Stock(String stockName, Set stockedProducts) {
       this.stockName = stockName;
       this.stockedProducts = stockedProducts;
    }
   
    public Integer getStockId() {
        return this.stockId;
    }
    
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }
    public String getStockName() {
        return this.stockName;
    }
    
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public Set getStockedProducts() {
        return this.stockedProducts;
    }
    
    public void setStockedProducts(Set stockedProducts) {
        this.stockedProducts = stockedProducts;
    }




}

