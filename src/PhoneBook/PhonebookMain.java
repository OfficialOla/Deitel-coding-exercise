package PhoneBook;

import javax.swing.*;
import java.util.Scanner;

public class PhonebookMain {
    private static Scanner keyboardInputCollector = new Scanner(System.in);
    private static Phonebook myPhonebook = new Phonebook();

    public static void main(String[] args) {
        gotoMainMenu();
    }
    public static void gotoMainMenu() {
        String mainMenu = """
                ===================
                Welcome to MainMenu
                1 -> Create contact
                2 -> View contact
                3 -> Edit contact
                4 -> Delete contact
                5 -> View all contacts
                6 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createContact();
            case '2' -> viewContact();
            case '3' -> editContact();
            case '4' -> deleteContact();
            case '5' -> viewAllContacts();
            case '6' -> exitApplication();
            default -> gotoMainMenu();
        }
    }

    private static void viewAllContacts() {
        try {
            myPhonebook.viewAllContact();
            display(myPhonebook.viewAllContact().toString());
        }catch(IllegalArgumentException e) {
            display(e.getMessage());
        }
        gotoMainMenu();
    }

    private static void deleteContact() {
        try {
            String firstName = input("Enter first name of contact be deleted");
            String lastName = input("Enter last name of contact be deleted");
            myPhonebook.deleteContact(firstName + " "+ lastName);
            display("contact deleted");
        } catch (IllegalArgumentException ex){
            display("Contact not found");
        }
        gotoMainMenu();
    }

    private static void editContact() {
        try {
            String firstName = input("Enter first name to find contact to be edited");
            String newFirstName = input("Enter first name");
            String newLastName = input("Enter last name");
            String phoneNumber = input("Enter phone number");
            String emailAddress = input("Enter email address");
            myPhonebook.updateContactFor(firstName, newFirstName, newLastName, phoneNumber, emailAddress);
            myPhonebook.animatedDisplay("loading");
        }catch (IllegalArgumentException ex) {
        display("Wrong input"); }
        display("Contact saved successfully");

        gotoMainMenu();
    }
    private static void viewContact() {
        try {
            String firstName = input("Enter first name");
            String lastName = input("Enter last name");
            Contact findContact = myPhonebook.viewContactByPhoneName(firstName + " " + lastName);
            display(findContact.toString());
        } catch (IllegalArgumentException e){
            display(e.getMessage());
        }
//        myPhonebook.animatedDisplay("searching");
//        try {
//            myPhonebook.viewContactFor(firstName);
//            String displayContact =String.format( """
//                The contact is %s
//                """, myPhonebook.viewContactFor(firstName));
//            myPhonebook.animatedDisplay("loading");
//            display(displayContact);
//        } catch (IllegalArgumentException | IndexOutOfBoundsException ex){
//            display("Contact not found");
//        }
        gotoMainMenu();
    }
    private static void createContact() {
        String emailAddress = null;
        String firstName = input("Enter first name");
        String lastName = input("Enter last name");
        String phoneNumber = input("Enter phone number");
        String emailRequest = input("Would you like to add email?");
        if (emailRequest.equalsIgnoreCase("yes")){
             emailAddress = input("Enter email address");}
        try {
            myPhonebook.createContactFor(firstName, lastName, phoneNumber, emailAddress);
        }catch (IllegalArgumentException | NullPointerException ex) {
            display(ex.getMessage());
            createContact();
        }
        display("Contact saved successfully");
        gotoMainMenu();
        }
    private static String input(String prompt){
            return JOptionPane.showInputDialog(prompt);
        }
        private static void display(String prompt){
            JOptionPane.showMessageDialog(null, prompt);
        }
        private static void exitApplication(){
        try{
           String exitOption = input("Sure you wanna exit app? yes/no ");
            if (exitOption.equalsIgnoreCase("Yes")){
                display("Thank you for using our application");
                System.exit(1);
            }gotoMainMenu();
        } catch (IllegalArgumentException e){
            display("Wrong input");
            exitApplication();
        }


        }
    }