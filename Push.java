package Oef;

public class Push implements Notification{
    private String about;
    private String Business;

    Push(String about_, String Business_){
        this.about = about_;
        this.Business = Business_;
    }

    @Override
    public void notifyUser(String Lekker){
        System.out.println("Print: Lekker");
    }
    
}