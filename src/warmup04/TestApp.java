/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup04;

/**
 *
 * @author INT105
 */

public class TestApp {
    public static void main(String[] args) {
        
        Faculty fc = new Faculty("it","KMUTT");
        Staff staff = new Staff(true);
        Student std = new Student("A",60130500114l,fc,staff);
        System.out.println(fc +"\n"+ staff+"\n" + std);
            
    }
    
}
