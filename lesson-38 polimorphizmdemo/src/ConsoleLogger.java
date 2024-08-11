public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String msg) {
        super.log(msg+"console logger");
    }
}
