/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G4.Lecture3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INT105
 */
public class EmployeeTest {
    public static void main(String[] args) {
        String test_name="Ike";
        Person emp = new Employee(test_name);
        System.out.println(emp);
        System.out.println("-----------------------------------");
        Person std = new Student("Ike",Student.Status.freshman);
        System.out.println(std);
        System.out.println(std.getSignature());
        
        Person[] persons=new Person[5];
//        Object[] persons=new Object[5];
        persons[0]=new Employee("Ying");
        persons[1]=new Student("Mild",Student.Status.freshman);
        persons[2]=new Student("Mild",Student.Status.junior);
        persons[3]=new Staff("An","Infha");
        persons[4]=new Employee("Mild");
        ((Student)persons[1]).getStatus();//แปลง Student เป็น Person เพื่อให้เรียกใช้ Status ได้
        Student std1 =new Student("A",Student.Status.freshman);
        Student std2 =new Student("A",Student.Status.freshman);

        if(std1.equals(std2)){
            System.out.println("\n-------------------\n");
            System.out.println("std1==std2");
        }else{
            System.out.println("\n**********************\n");
            System.out.println("std1!=std2");
        }
        
        for(int i=0;i<persons.length;i++){
            System.out.println("\n-------------------\n");
            System.out.println(persons[i]);
        }
        System.out.println(persons[0] instanceof Student);
        }
    @Test
    public void setNameToEmployee(){
        String test_name="Ike";
        Employee emp = new Employee(test_name);
        assertEquals(test_name,emp.getName());
    }
  
}
