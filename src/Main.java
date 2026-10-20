import behavioral.command.AddProductCommand;
import behavioral.command.Button;
import behavioral.command.ProductService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService(new ArrayList<>(0));
        AddProductCommand addProductCommand = new AddProductCommand(productService);
        Button btn = new Button(addProductCommand);
        btn.click();
        btn.click();
        System.out.println(productService.getProducts());
    }
}