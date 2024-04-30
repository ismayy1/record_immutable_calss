package record2;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    //list to store product
    List<Product> products = new ArrayList<>();

    // method to add new product
    public void addNewProduct (Product product) {
        this.products.add(product);
    }

    // method to remove product from list
    public void removeProduct (Product product) {
        this.products.remove(product);
    }

    // method to list all products
    public void allProducts () {
        for (Product p: products) {
            System.out.println("Product name: " + p.name() +
                    " - Price: " + p.price() + " isAvailable: " + p.isAvailable());
        }
    }

    // method to return only available products
    public void availableProducts() {
        for (Product p: products) {
            if (p.isAvailable()) {
                System.out.println("Product name: " + p.name() +
                        " - Price: " + p.price() + " isAvailable: " + p.isAvailable());
            }
        }
    }

}
