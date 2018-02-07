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
public class Student {
    private String name;
    private long id;
    private Faculty facculty;
    private Staff staff;

    public Student(String name, long id, Faculty facculty, Staff staff) {
        this.name = name;
        this.id = id;
        this.facculty = facculty;
        this.staff = staff;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Faculty getFacculty() {
        return facculty;
    }

    public void setFacculty(Faculty facculty) {
        this.facculty = facculty;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", facculty=" + facculty + ", staff=" + staff + '}';
    }
    
}
