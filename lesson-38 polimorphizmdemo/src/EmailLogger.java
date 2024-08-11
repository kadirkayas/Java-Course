public class EmailLogger extends BaseLogger{
    @Override
    public void log(String msg) {
        super.log(msg+"email");
    }
}
