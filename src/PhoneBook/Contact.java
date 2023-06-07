package PhoneBook;

public class Contact {
    private String phoneNumber;
    private String phoneName;
    private String firstName;
    private String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public Contact(String phoneName, String phoneNumber, String emailAddress){
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String toString(){
        return String.format("""
                1. Phone Name: %s
                2. Phone Number: %s
                3. Email Address: %s""",
                phoneName, phoneNumber, emailAddress);
    }
}
