package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    private Phonebook myPhonebook;
    @BeforeEach
    public void setUp(){
        myPhonebook = new Phonebook();
        myPhonebook.createContactFor("Joshua", "Kuse", "0122", "joshkuse@gmail.com");
        myPhonebook.createContactFor("Josh", "Ku", "012", "joshkuse@gmail.com");
    }

    @Test
    public void testContactIsCreated(){
      assertNotNull(myPhonebook.toString());
        String info = """
                1. Phone Name: Joshua Kuse
                2. Phone Number: 0122
                3. Email Address: joshkuse@gmail.com""";
    }

    @Test
    public void testUpdateContact(){
        myPhonebook.createContactFor("Joshua", "Kuse", "0122", "joshkuse@gmail.com");
//        myPhonebook.updateContact("James", "Oluwakushe", "0111", "joshkuse@gmail.com");
        Contact contact = myPhonebook.getContact("Joshua Kuse");
        assertEquals("Joshua Kuse", contact.getPhoneName());
//        assertEquals(3, myPhonebook.getNumberOfContacts());

    }

    @Test
    public void numberOfContactTest() {
        System.out.println(myPhonebook.getContact("Josh"));
        assertEquals(2, myPhonebook.getNumberOfContacts());
    }
    @Test
    public void viewContactTest(){
        myPhonebook.createContactFor("Yinka","Ola", "0000", "Yinka1234@gmail.com");
        myPhonebook.createContactFor("Kayode","Ade", "08090", "Kayode1234@gmail.com");
        Contact findContact = myPhonebook.viewContactByPhoneName("Yinka Ola");
        assertEquals("Yinka1234@gmail.com", findContact.getEmailAddress());
       // System.out.println(myPhonebook.viewContactFor("Joshua").toString());
        assertEquals(4, myPhonebook.viewAllContact().size());
        System.out.println(myPhonebook.viewAllContact());
        String info = """
                1. Phone Name: Joshua Kuse
                2. Phone Number: 0122
                3. Email Address: joshkuse@gmail.com""";

//        assertEquals(info, myPhonebook.viewContactFor("Joshua").toString());
    }
    @Test
    public void updateContactTest(){
          myPhonebook.updateContactFor("Joshua", "John", "Mark", "0908", " joshkuse@gmail.com");
        String info = """
                1. Phone Name: John Mark
                2. Phone Number: 0908
                3. Email Address:  joshkuse@gmail.com""";
         assertEquals(info, myPhonebook.viewContactByPhoneName("John Mark").toString());
    }
    
    @Test
    public void deleteContactTest(){
        System.out.println(myPhonebook.viewAllContact());
        myPhonebook.deleteContact("Joshua Kuse");

        assertEquals(1, myPhonebook.getNumberOfContacts());
    }
    @Test
    public void viewAllContactTest(){
        System.out.println(myPhonebook.viewAllContact());
    }
}