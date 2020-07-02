import java.util.ArrayList;

public class Contacts {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String city;
    private String state;

    public Contacts (String name, String emailAddress, String phoneNumber, String city, String state){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Email Address: " + emailAddress + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "City :" + city + " State :" +  state +  '\n';
    }




}