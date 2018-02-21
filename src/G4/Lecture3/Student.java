package G4.Lecture3;
public class Student extends Person{
    // (freshman, sophomore, junior, or senior) 
    public enum Status{freshman,sophomore, junior, senior};
    Status status;

    public Student(String name, Status status) {
        super(name);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String getSignature(){
        String result;
        result=super.getName().substring(0, 2);
        result+="-"+super.getName().substring(super.getName().length()-2);
        return result.toUpperCase();
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+ "status : " + status;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        if(obj!=null && obj instanceof Student){
            if(super.getName()==((Student)obj).getName()){
                result = true;
            }
        }
        return result;
    }
    
    
}
