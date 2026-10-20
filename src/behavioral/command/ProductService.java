package behavioral.command;

import java.util.ArrayList;

public class ProductService {

    private final ArrayList<String> products;

    public ProductService(ArrayList<String> products) {
        this.products = products;
    }

    public void addProduct(String productName) {
        this.products.add(productName);
    }

    public ArrayList<String> getProducts() {
        return products;
    }
}
