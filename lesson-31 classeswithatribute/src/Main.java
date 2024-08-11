public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(44);
        product.setName("laptop");
        product.setDescription("monster notbook");


        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}