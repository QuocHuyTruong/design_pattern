/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt3_Singleton;

/**
 *
 * @author DELL
 */
public class Circle extends Shape{
    private static Circle circle;
    public Circle(){
        
    }
    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    @Override
    public String draw(){
        return "tron";
    }
    public static Circle create(){
        if(circle==null){
            circle=new Circle();
        }
        return circle;
    }
}
