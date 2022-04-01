/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt3_Singleton;

/**
 *
 * @author DELL
 */
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        Shape shape;
        switch(shapeType) 
        {
            case Rectangle -> {
                return shape = Rectangle.create();
            }
            case Triangle -> {
                return shape = Triangle.create();
            }
            case Circle -> {
                return shape = Circle.create();
            }
        }
        return null;
    }
}
