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
public class Organization {
    public static void main(String[] args) {
        Student std =new Student("SUTHIWAT","SIT KMUTT","0876987273","suthiwat.ssirith@mail.kmutt.ac.th", Student.Status.freshman);
        
        Person ps = new Person("S", "KMUTT","911" , "useless@mail.kmutt.ac.th");
        System.out.println(ps);
        System.out.println("\tPerson email gen : "+ps.genEmail());
        System.out.println(std);
        System.out.println("\tEmail gen : "+std);
        
        Faculty fc = new Faculty("00:00 - 00:01","Rookie" , "Tofu", "Uganda", "911","911@hotmail.com", "Da wae office", 800000);
        System.out.println(fc);
        System.out.println("\tFaculty email gen : "+fc);
    }
    
}
