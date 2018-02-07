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
public class Staff extends Employee{
    private String title;

    public Staff(String title, String name, String address, String phonenumber, String emailAddress, String office, double salary) {
        super(name, address, phonenumber, emailAddress, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"Title : "+title;
    }
    
}
