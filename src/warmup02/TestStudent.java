package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        Student[] std = new Student[3];
        std[0] = new Student("a");
        std[1] = new Student("b");
        std[2] = new Student("c");
        System.out.println("For each loop");
        for(Student a : std){
            System.out.println(a);
        }
        System.out.println("-----------------------------------------");
        
        System.out.println("For  loop");
        for(int i = 0;i<std.length;i++){
            System.out.println(std[i]);
        }

    }

}
