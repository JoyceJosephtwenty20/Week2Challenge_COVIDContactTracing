import java.util.ArrayList;

public class AdditonalContacts {
    private String c1name;
    private String c1emailAddress;
    private String c1phoneNumber;

    public AdditonalContacts() {
    }

    public AdditonalContacts(String c1name, String c1emailAddress, String c1phoneNumber) {
        this.c1name = c1name;
        this.c1emailAddress = c1emailAddress;
        this.c1phoneNumber = c1phoneNumber;
    }

    public String getC1name() {
        return c1name;
    }

    public void setC1name(String c1name) {
        this.c1name = c1name;
    }

    public String getC1emailAddress() {
        return c1emailAddress;
    }

    public void setC1emailAddress(String c1emailAddress) {
        this.c1emailAddress = c1emailAddress;
    }

    public String getC1phoneNumber() {
        return c1phoneNumber;
    }

    public void setC1phoneNumber(String c1phoneNumber) {
        this.c1phoneNumber = c1phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + c1name + '\n' +
                "Email Address: " + c1emailAddress + '\n' +
                "Phone Number: " + c1phoneNumber + '\n';
    }
}