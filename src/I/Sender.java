package I;

public interface Sender {
    void establishSMTPServer(String addr, int port);
    boolean send(Object target);
    int get(String addr);
    int put(String addr);

}
