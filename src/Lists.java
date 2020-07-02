import java.util.ArrayList;

public class Lists {
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    ArrayList<AdditonalContacts> additonalContacts = new ArrayList<AdditonalContacts>();

    // Methods for contacts
    public void addContacts(Contacts contacts){
        this.contacts.add(contacts);
    }

    public String allContacts (){
        String allContacts = "";
        for(Contacts c : contacts)
            allContacts +=  c.toString() + "\n\n";
        return allContacts;
    }

    // Methods for contacted individuals
    public void addAdditional(AdditonalContacts additonalContacts){
        this.additonalContacts.add(additonalContacts);
    }

    public String allAdditionalContacts (){
        String allAdditionalContacts = "";
        for(AdditonalContacts ac : additonalContacts)
            allAdditionalContacts +=  ac.toString() + "\n\n";
        return allAdditionalContacts;
    }
}