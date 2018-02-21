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
public class Rectangle {
    private double width;
    private double high;

    
    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", high=" + high + '}';
    }
    
    
    
}
