package I;

public class EmailMessageSender implements Sender{
    @Override
    public void establishSMTPServer(String addr, int port) {

    }

    @Override
    public boolean send(Object target) {
        return false;
    }

    @Override
    public int get(String addr) {
        return 0;
    }

    @Override
    public int put(String addr) {
        return 0;
    }
}
