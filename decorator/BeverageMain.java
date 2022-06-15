/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author DELL
 */
public class BeverageMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage b = new DarkRoast("6");
        b = new Soy(b, "5");
        b = new Milk(b, "4");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }

}
