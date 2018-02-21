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
public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        super("White");

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public String toString() {
        return "Circle" + "radius=" + radius + "\tArea : " + this.getArea() + super.toString();

    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj!=null && obj instanceof Circle) {
            if (this.radius == ((Circle) obj).getRadius()){
                result = true;
            }
        }
        return result;
    }
    

}
