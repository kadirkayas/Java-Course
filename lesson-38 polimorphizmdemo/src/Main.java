public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers={new DatabaseLogger(),new EmailLogger(), new Filelogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log("test logger ");
//        }

        CustomerManager customerManager =new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}