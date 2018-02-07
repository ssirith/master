package G4.Lecture04;

public class Person {
    protected String name;
    protected String address;
    protected String phonenumber;
    protected String emailAddress;

    public Person() {
    }
    

    public Person(String name, String address, String phonenumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailAddress = emailAddress;
    }
    public String genEmail(){
        String emailgen = "";
        emailgen = this.name.toLowerCase()+"@sit.kmutt.ac.th";
        return emailgen;
    }

    @Override
    public String toString() {
            return this.name+"\n\t"+"Address : " + this.address + "\n\t"+"Phone : "+this.phonenumber
                +"\n\t"+"Email : "+this.emailAddress;
    }
    
}
