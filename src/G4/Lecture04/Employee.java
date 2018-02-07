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
public class Employee extends Person {

    protected String office;
    protected double salary;

    public Employee(String name, String address, String phonenumber, String emailAddress,String office, double salary) {
        super(name, address, phonenumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tOffice : "+office+"\n\tSalary : "+salary;
    }

}
