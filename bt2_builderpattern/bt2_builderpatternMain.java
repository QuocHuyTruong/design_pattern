/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2_builderpattern;

/**
 *
 * @author DELL
 */
public class bt2_builderpatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder str = new MyStringBuilder();
        str.addString("truong quoc huy");
        str.addFloat((float) 0.5);
        str.addBool(true);
        System.out.println(str.toString());
    }
    
}
