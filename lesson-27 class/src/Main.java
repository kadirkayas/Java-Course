public class Main {
    public static void main(String[] args) {
        CustomerManager cm;
        CustomerManager cm2 =new CustomerManager();
        cm=cm2;
        cm2.Add();
    }
}