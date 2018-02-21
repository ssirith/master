package G4.Lecture3;

public class Faculty extends Employee {
   private String officeHours;
   private String rank;

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
    
   
}
