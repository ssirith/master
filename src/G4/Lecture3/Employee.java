package G4.Lecture3;

public class Employee extends Person {
    protected String office;
    protected double salary;

    public Employee(String office, double salary, String name) {
        super(name);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name,String address,String phoneNumber,String emailAddress) {
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
    }
     
    public Employee(String name){
        super(name);
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Employee{" +", office=" + office + ", salary=" + salary + '}';
    }
    
    
}
