package record2;

public class Runner {
    public static void main(String[] args) {

        Product product1 = new Product("iPad", 350.9, true);
        Product product2 = new Product("Monitor", 150.0, false);
        Product product3 = new Product("Mouse", 50.9, true);

        ProductService service = new ProductService();
        // add new products
        service.addNewProduct(product1);
        service.addNewProduct(product2);
        service.addNewProduct(product3);

        //list available products
        service.availableProducts();

    }
}
