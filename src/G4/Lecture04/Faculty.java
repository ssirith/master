/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G4.Lecture04;

/**
 *
 * @author INT105
 */
public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank, String name, String address, String phonenumber, String emailAddress, String office, double salary) {
        super(name, address, phonenumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tOffice hours : "+officeHours+"\n\tRank : "+rank;
    }
    
    
}
