package behavioral.command;

public class AddProductCommand implements Command {

    private final ProductService productService;

    public AddProductCommand(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute() {
        this.productService.addProduct(String.format("Product %f", Math.random()));
    }
}
