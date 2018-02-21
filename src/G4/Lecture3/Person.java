package G4.Lecture3;
public class Person {
    private String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public Person(String name) {
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return name + "\naddress=" + address + "\nphoneNumber=" + phoneNumber + "\nemailAddress=" + emailAddress;
    }
    
    public String getSignature(){
        String result;
        result=name.substring(0, 2);
        result+=name.substring(name.length()-2);
        return result.toUpperCase();
    }
    
}
