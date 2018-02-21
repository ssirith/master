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
public class Rectangle  extends Shape{
    private double width;
    private double high;

    public Rectangle(String color,double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    public Rectangle(double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    
    public double getArea(){
        return this.high*this.width;
    }
    
        
    
    @Override
    public String toString() {
        return "Rectangle" + "\twidth=" + width + "\thigh=" + high +"\tArea"+this.getArea()+super.toString();
    }
    @Override
     public boolean equals(Object obj) {
        boolean result = false;
        if (obj!=null && obj instanceof Rectangle) {
            if (this.width == ((Rectangle) obj).getWidth()&&this.high == ((Rectangle)obj).getHigh()){
                result = true;
            }
        }
        return result;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.high+this.width);
    }
    
}
