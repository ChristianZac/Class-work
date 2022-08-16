package Oef;

public class app {
    public static void main(String[] args) {
        FactoryNotification.createNotification(Push.PUSH).notifyUser("Lekker");
    }
}