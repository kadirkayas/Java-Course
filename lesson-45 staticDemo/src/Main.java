public class Main {
    public static void main(String[] args) {
    ProductManager pm = new ProductManager();
    Product product=new Product();
    product.price=10;
    product.name="mause";

    pm.add(product);
    }
}