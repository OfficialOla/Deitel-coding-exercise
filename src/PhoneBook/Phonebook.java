package PhoneBook;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {
    private ArrayList<Contact> myContacts = new ArrayList<>();
    public void createContactFor(String firstName, String lastName, String phoneNumber, String emailAddress) {
        Contact myNewContact = new Contact(firstName + " " + lastName, phoneNumber,  emailAddress);
        myContacts.add(myNewContact);
    }
    public Contact getContact(String firstName) {
        for (Contact contact: myContacts) {
            System.out.println(contact);
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                return contact;
            }
        }
        return null;
    }
     public int getNumberOfContacts() {
        return myContacts.size();
    }

    public void updateContactFor(String firstName, String newfirstName, String newlastName, String newphoneNumber, String newemailAddress) {
        int num = 0;
        for (int index = 0; index < myContacts.size() ; index++) {
            if(firstName.equalsIgnoreCase(myContacts.get(index).getFirstName())){
                num = index;
            }
            Contact editedContact = new Contact(newfirstName, newphoneNumber, newphoneNumber);
            editedContact.setPhoneName(newfirstName + " " + newlastName);
            editedContact.setPhoneNumber(newphoneNumber);
            editedContact.setEmailAddress(newemailAddress);
                myContacts.set(num, editedContact);
            }

        }

    public Contact viewContactFor(String firstName) {
        for (Contact myContact : myContacts) {
            if (Objects.equals(myContact.getFirstName(), firstName)) {
                return myContact;
            }
        }
        return null;
    }
    public void deleteContact(String phoneName) {
//        try {
            Contact deletedContact = viewContactByPhoneName(phoneName);
            myContacts.remove(deletedContact);
//        }catch (IllegalArgumentException e){
//        throw new IllegalArgumentException("Contact does not exist");}
        //myContacts.removeIf(contact -> contact.getPhoneName().equals(firstName + " " + lastName));
    }
    public int countContacts(){
        return myContacts.size();
    }

    public List<Contact> viewAllContact() {
        if (myContacts.size() == 0){
            throw new IllegalArgumentException("No contact found");
        }
        return myContacts;
    }
    public Contact viewContactByPhoneName(String phoneName){
        for (Contact contacts: myContacts)
            if (contacts.getPhoneName().equalsIgnoreCase(phoneName)){
                return contacts;
//            }else throw new IllegalArgumentException("No contact matched");

        }
        return  null;
    }

    public void animatedDisplay(String action){
        JOptionPane.showMessageDialog(null, action);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, action);
    }
}
