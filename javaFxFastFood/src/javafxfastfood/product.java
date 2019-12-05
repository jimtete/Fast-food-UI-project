/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxfastfood;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author jim-t
 */
public class product {
    private SimpleStringProperty name;
    private int quantity,price;

    public product(String name, int quantity, int price) {
        this.name = new SimpleStringProperty(name);
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name.get();
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}
