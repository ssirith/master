package G4.Lecture3;

public class Staff extends Employee {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff(String title, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n"+"Staff{" + "title=" + title + ", Name="+super.getName()+'}';
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        if(obj!=null && obj instanceof Staff){
            if(super.getName()==((Staff)obj).getName()){
                result = true;
            }
        }
        return result;
    }
    
}
