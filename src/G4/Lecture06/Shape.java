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
public  abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public final String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return "\tColor=" + color;
    }

}
