/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt3_Singleton;

/**
 *
 * @author DELL
 */
public class bt3_SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shape=new ShapeFactory();

            Shape circle = shape.createShape(ShapeType.Circle);
            circle.setBrush("circle setBrush");
            circle.setFrame("circle setFrame");
            circle.setPaper("circle setPaper");
            System.out.println(circle.toString());


            Shape rectangle = shape.createShape(ShapeType.Rectangle);
            rectangle.setBrush("rectangle setBrush");
            rectangle.setFrame("rectangle setFrame");
            rectangle.setPaper("rectangle setPaper");
            System.out.println(rectangle.toString());
            
            
            Shape triangle = shape.createShape(ShapeType.Triangle);
            triangle.setBrush("triangle setBrush");
            triangle.setFrame("triangle setFrame");
            triangle.setPaper("triangle setPaper");
            System.out.println(triangle.toString());
    }
    
}
