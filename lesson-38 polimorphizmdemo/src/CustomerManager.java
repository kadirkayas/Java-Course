public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add(){
        System.out.println("user added");
        this.logger.log("log message");
    }
}
