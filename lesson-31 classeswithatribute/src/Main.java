public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="laptop";
        product.price=2000;
        product.id=44;
        product.description="al la al";
        product.stock=10;
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}