package Oef;

public class FactoryNotification {
    public static Notification createNotification(String input){
        if(input == null || input.isEmpty()){
            return null;
        }else if(input.equals(Notification.EMAIL)){
            return new Email("Internship", "Belgium");
        }else if(input.equals(Notification.SMS)){
            return new SMS("Internship", "Belgium");
        }else if(input.equals(Notification.PUSH)){
            return new Push("Internship", "Belgium");
        }else{
            return null;
        }
    }
}
