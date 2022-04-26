/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt3_Singleton;

/**
 *
 *
 * @author DELL
 */
public class Rectangle extends Shape{
    private static Rectangle rectangle;
    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public Rectangle() {
    }
    @Override
    public String draw(){
        return "chunhat";
    }
    public static Rectangle create(){
        if(rectangle==null){
            rectangle=new Rectangle();
        }
        return rectangle;
    }
}
