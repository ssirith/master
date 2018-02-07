package G4.Lecture04;

public class Student extends Person {
    
    public static enum Status {
        freshman, sophomore, junior, senior
    };
    public Status status;
    
    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Status : " + this.status;
    }
    
}
