public class ProductManager {
    public void add(Product product){
        ProductValidator validator=new ProductValidator();
        if(validator.isValid(product)){
            System.out.println("Product added successfully");
        }
        else {
            System.out.println("Product not added");
        }
    }
}
