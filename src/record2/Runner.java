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


        // method to update fields
        // since we can't update any field of record class,
        // to update any field, we need to add new object and remove existing one

        System.out.println("=================== Updated List ====================");
        // create new field using values from product2
        Product updatedProduct = new Product(product2.name(), product2.price(), true);

        // ad newly created record to the products list
        service.addNewProduct(updatedProduct);
        // remove old record from the products list
        service.removeProduct(product2);

        service.availableProducts();

    }
}
