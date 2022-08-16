package Oef;

public class Email implements Notification{

    private String about;
    private String Business;

    Email(String about_, String Business_){
        this.about = about_;
        this.Business = Business_;
    }

    @Override
    public void notifyUser(String Lekker){
        System.out.println("Print: Lekker");
    }
    
}
