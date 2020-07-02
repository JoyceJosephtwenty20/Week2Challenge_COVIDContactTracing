import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class  COVID19App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name ="";
        String emailAddress ="";
        String phoneNumber = "";
        String city = "";
        String state = "";

        Lists lists = new Lists();

        //Application Banner
        System.out.println("Contact Tracing Program\n" +
                "Enter a newly infected person's information");

        // Patient details

        System.out.println("What is a patient's name?");
        name = input.nextLine();
        System.out.println("What is a patient's phone number? ");
        phoneNumber = input.nextLine();
        System.out.println("What is a patient's email? ");
        emailAddress = input.nextLine();
        System.out.println("What city does and state a patient live in?");
        city = input.nextLine();
        System.out.println("What city does and state a patient live in?");
        state = input.nextLine();
        Contacts contacts = new Contacts(name, phoneNumber, emailAddress,
                city, state);

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
        String ansBreathD = "";
        if(ansBreath.equalsIgnoreCase("Y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansBreathD = input.nextLine();
        }

        //TIREDNESS

        System.out.println("Does " + name +  " have any symptom for " +
                "Tiredness? (y/n)");
        String ansTiredness = input.nextLine();
        String ansTirednessD ="";
        if(ansTiredness.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansTirednessD = input.nextLine();
        }

        // ACHES

        System.out.println("Does " + name +  " have any symptom for Aches? (y/n)");
        String ansAches = input.nextLine();
        String ansAchesD = "";
        if(ansAches.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
           ansAchesD = input.nextLine();
        }

        // CHILLS

        System.out.println("Does " + name +  " have any symptom for Chills? " +
                "(y/n)");
        String ansChills = input.nextLine();
        String ansChillsD = "";
        if(ansChills.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
           ansChillsD = input.nextLine();
        }

        //SORE THROAT

        System.out.println("Does " + name + " have any symptom for Sore " +
                "throat? (y/n)");
        String ansSorethroat = input.nextLine();
        String ansSorethroatD = "";
        if(ansSorethroat.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansSorethroatD = input.nextLine();
        }

        //LOSS OF SMELL

        System.out.println("Does " +  " have any symptom for Loss of smell? (y/n)");
        String ansSmell = input.nextLine();
        String ansSmellD = "";
        if(ansSmell.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansSmellD = input.nextLine();
        }

        // LOSS OF TASTE

        System.out.println("Does " + name +  " have any symptom for Loss of " +
                "taste? (y/n)");
        String ansTaste = input.nextLine();
        String ansTasteD = "";
        if(ansTaste.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansTasteD = input.nextLine();
        }

        // HEADACHE

        System.out.println("Does " + name +  " have any symptom for Headache?" +
                " (y/n)");
        String ansHeadache = input.nextLine();
        String ansHeadacheD = "";
        if(ansHeadache.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansHeadacheD = input.nextLine();
        }

        //DIARRHEA

        System.out.println("Does " + name +  " have any symptom for Diarrhea?" +
                " (y/n)");
        String ansDiarrhea = input.nextLine();
        String ansDiarrheaD = "";
        if(ansDiarrhea.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansDiarrheaD = input.nextLine();
        }

        //VOMITTING

        System.out.println("Does " + name + " have any symptom for Severe " +
                "vomiting? (y/n)");
        String ansVomiting = input.nextLine();
        String ansVomitingD = "";
        if(ansVomiting.equalsIgnoreCase("y")){
            System.out.println("How long has " + name + " had this symptom " +
                    "for?");
            ansVomitingD = input.nextLine();
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
            System.out.println("\thad fever for " + ansFeverD + " days");
        }
        if(ansCoughD.equalsIgnoreCase("y")){
            System.out.println("\thad cough for " + ansCoughD + "  days");
        }
        if(ansBreath.equalsIgnoreCase("y")){
            System.out.println("\thad difficulty breating for" + ansBreathD + " days");
        }
        if(ansTiredness.equalsIgnoreCase("y")){
            System.out.println("\thad Tiredness for " + ansTirednessD + " days");
        }
        if(ansAches.equalsIgnoreCase("y")){
            System.out.println("\thad Aches symptoms for" + ansAchesD + " days");
        }
        if(ansChills.equalsIgnoreCase("y")){
            System.out.println("\thad Chills for " + ansChillsD + " days");
        }
        if(ansSorethroat.equalsIgnoreCase("y")){
            System.out.println("\thad Sore Throat for " + ansSorethroatD + " days");
        }
        if(ansSmell.equalsIgnoreCase("y")){
            System.out.println("\thad loss of smell for " + ansSmellD + " days");
        }
        if(ansTaste.equalsIgnoreCase("y")){
            System.out.println("\thad loss of taste for " + ansTasteD + " days");
        }
        if(ansHeadache.equalsIgnoreCase("y")){
            System.out.println("\thad symptoms of Headache for " + ansHeadacheD + " days");
        }
        if(ansDiarrhea.equalsIgnoreCase("y")){
            System.out.println("\thad Diarrhea for" + ansDiarrheaD + " days");
        }
        if(ansVomiting.equalsIgnoreCase("y")){
            System.out.println("\thad vomiting for " + ansVomitingD + " days");
        }


        System.out.println("\n\n** \tContacts: ");
        System.out.println(lists.allAdditionalContacts());


    }
}