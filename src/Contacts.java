import java.util.ArrayList;

public class Contacts {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String address;

    public Contacts (String name, String emailAddress, String phoneNumber, String address){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Email Address: " + emailAddress + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Address: " + address + '\n';
    }




}