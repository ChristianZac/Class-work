package Oef;

public interface Notification {
    String EMAIL = "Email";
    String SMS = "Sms";
    String PUSH = "Push";

    void notifyUser(String Lekker);
}
