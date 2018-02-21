/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup06;

/**
 *
 * @author INT105
 */
public class Circle {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    
    public double getArea() {
        return 0;
    }
   
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
