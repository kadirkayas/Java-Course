public class Main {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager(new OracleCustomerDal());

        cm.add();
    }
}