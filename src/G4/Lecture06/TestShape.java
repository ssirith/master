/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G4.Lecture06;

/**
 *
 * @author INT105
 */
public class TestShape {
    public static void main(String[] args) {
        Shape shape01 = new Circle(10);
        Shape shape02 = new Rectangle(10, 20);
        Shape shape03 = new Circle(10);
        Shape shape04 = new Rectangle(10, 20);
        System.out.println(shape01.toString());
        System.out.println(shape02.toString());
 
       
        System.out.println((shape01).getArea());
        System.out.println("shape01 = shape03 ?? : "+shape01.equals(shape03));
        System.out.println("shape02 = shape04 ?? : "+shape02.equals(shape04));
    }
}
