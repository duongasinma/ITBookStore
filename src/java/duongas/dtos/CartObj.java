/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DUONGAS
 */
public class CartObj implements Serializable{
    private Map<String, BookDTO> items;

    public Map<String, BookDTO> getItems() {
        return items;
    }
    public void addBookToCart(BookDTO book) {
        if (this.items == null) {
            this.items = new HashMap<>();
        }
        int quantity = 1;
        if (this.items.containsKey(book.getId().trim())) {
            quantity = this.items.get(book.getId()).getQuantity() + 1;
        }
        book.setQuantity(quantity);
        this.items.put(book.getId().trim(), book);
    }
    public void reduceBookToCart(BookDTO book) {
        int quantity = 1;
        if (this.items.get(book.getId()).getQuantity() > 1) {
            quantity = this.items.get(book.getId()).getQuantity() - 1;
            book.setQuantity(quantity);
            this.items.put(book.getId().trim(), book);
        }
        
    }

    public void removeBookFromCart(String id) {
        if (this.items == null) {
            return;
        }
        if (this.items.containsKey(id.trim())) {
            this.items.remove(id);
            if (this.items.isEmpty()) {
                this.items = null;
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (BookDTO book : this.items.values()) {
            total += book.getPrice() * book.getQuantity();
        }
        return total;
    }

    
}
