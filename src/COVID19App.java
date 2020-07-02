import java.util.ArrayList;
import java.util.Scanner;

public class  COVID19App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name ="";
        String emailAddress ="";
        String phoneNumber = "";
        String address = "";

        Lists lists = new Lists();

        // Patient details

        System.out.println("What is a patient's name?");
        name = input.nextLine();
        System.out.println("What is a patient's phone number? ");
        phoneNumber = input.nextLine();
        System.out.println("What is a patient's email? ");
        emailAddress = input.nextLine();
        System.out.println("What city does and state a patient live in?");
        address = input.nextLine();
        Contacts contacts = new Contacts(name, phoneNumber, emailAddress,
                address);

        // Symptom questions
        // FEVER
        System.out.println("Does " + name + " have any symptom for Fever? " +
                "(y/n)");
        String ansFever = input.nextLine();
        String ansFeverD = "";
        if(ansFever.equalsIgnoreCase("y")) {
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansFeverD = input.nextLine();
        }

        // COUGH
        System.out.println("Does " + name + " have any symptoms for Cough? " +
                "(y/n)");
        String ansCough = input.nextLine();
        String ansCoughD = "";
        if(ansCough.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansCoughD = input.nextLine();
        }

        // SHORTNESS OF BREATH
        System.out.println("Does " + name + " have any symptom for Shortness " +
                " of breath or difficulty breathing? (y/n)");
        String ansBreath = input.nextLine();
        if(ansBreath.equalsIgnoreCase("Y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansBreathD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for " +
                "Tiredness? (y/n)");
        String ansTiredness = input.nextLine();
        if(ansTiredness.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansTirednessD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for Aches? (y/n)");
        String ansAches = input.nextLine();
        if(ansAches.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansAchesD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for Chills? " +
                "(y/n)");
        String ansChills = input.nextLine();
        if(ansChills.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansChillsD = input.nextLine();
        }
        System.out.println("Does " + name + " have any symptom for Sore " +
                "throat? (y/n)");
        String ansSorethroat = input.nextLine();
        if(ansSorethroat.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansSorethroatD = input.nextLine();
        }
        System.out.println("Does " +  " have any symptom for Loss of smell? (y/n)");
        String ansSmell = input.nextLine();
        if(ansSmell.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansSmellD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for Loss of " +
                "taste? (y/n)");
        String ansTaste = input.nextLine();
        if(ansTaste.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansTasteD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for Headache?" +
                " (y/n)");
        String ansHeadache = input.nextLine();
        if(ansHeadache.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansHeadacheD = input.nextLine();
        }
        System.out.println("Does " + name +  " have any symptom for Diarrhea?" +
                " (y/n)");
        String ansDiarrhea = input.nextLine();
        if(ansDiarrhea.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansDiarrheaD = input.nextLine();
        }
        System.out.println("Does " + name + " have any symptom for Severe " +
                "vomiting? (y/n)");
        String ansVomiting = input.nextLine();
        if(ansVomiting.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            String ansVomitingD = input.nextLine();
        }

        String ansAddName = "";
        String ansAddPhone = "";
        String ansAddEmail = "";
        System.out.println("Has " + name + " met or run into anyone? " +
                "(y/n)");
        String ansAdditonalV = input.nextLine();
        do {
            System.out.println("What s his/her name? ");
            ansAddName = input.nextLine();
            System.out.println("What is his/her Phone number? ");
            ansAddPhone = input.nextLine();
            System.out.println("What is her/her email? ");
            ansAddEmail = input.nextLine();
            AdditonalContacts ac = new AdditonalContacts(ansAddName,
                    ansAddPhone, ansAddEmail);
            lists.addAdditional(ac);
            System.out.println("Has " + name + " met or run into anyone? " +
                    "(y/n)");
            ansAdditonalV = input.nextLine();
        } while (!ansAdditonalV.equalsIgnoreCase("n"));


        System.out.println("***** Contact Tracing Report *****");
        lists.addContacts(contacts);
        System.out.println(lists.allContacts());

        System.out.println("** \t Symptoms: " );
        if(ansFever.equalsIgnoreCase("y")){
            System.out.println("had fever for " + ansFeverD + " days");
        }
        if(ansCoughD.equalsIgnoreCase("y")){
            System.out.println("had cough for " + ansCoughD + " days");
        }
        System.out.println();











        System.out.println("** \tContacts: ");
        System.out.println(lists.allAdditionalContacts());


    }
}