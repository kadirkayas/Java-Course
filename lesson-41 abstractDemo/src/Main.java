public class Main {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        cm.baseDatabaseManager=new OracleDatabaseManager();
        cm.getCustomer();
    }
}