/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt3_Singleton;

/**
 *
 * @author DELL
 */
public abstract class Shape {
   private String brush;
   private String paper;
   private String frame;
   public abstract String draw();
    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    public Shape(){
        
    }
   @Override
    public String toString(){
        return draw() + "," + brush + "," + paper + "," + frame;
    }
    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
