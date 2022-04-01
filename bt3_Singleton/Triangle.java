/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt3_Singleton;

/**
 *
 * @author DELL
 */
public class Triangle extends Shape{
    private static Triangle triangle;

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public Triangle() {
        
    }
    @Override
    public String draw(){
        return "Tamgiac";
    }
    public static Triangle create(){
        if(triangle==null){
            triangle=new Triangle();
        }
        return triangle;
    }
}
