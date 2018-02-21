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
public class Shape {
    private String color;
    private Circle circle;
    private Rectangle rectangle;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", circle=" + circle + ", rectangle=" + rectangle + '}';
    }
    
    
}
