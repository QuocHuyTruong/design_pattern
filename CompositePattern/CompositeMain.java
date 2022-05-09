/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompositePattern;

import java.text.ParseException;

/**
 *
 * @author DELL
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        AbstracFile f1 = new File("a1", "b", "c");
        AbstracFile f2 = new File("a2", "b", "c");
        AbstracFile f3 = new File("a3", "b", "c");
        AbstracFile f4 = new File("a4", "b", "c");

        AbstracFile F = new Folder("D:\\", "F1", "10/10/2022");
        AbstracFile F2 = new Folder("D:\\", "F2", "10/10/2022");
        AbstracFile F3 = new Folder("D:\\", "F3", "10/10/2022");
        AbstracFile F4 = new Folder("D:\\", "F4", "10/10/2022");
        F.add(F2);
        F.add(f1);
        F.add(f2);
        F.add(f3);
        F.add(f4);
        F.add(F3);
        F2.add(F4);
        System.out.println(F.getStringTreeFolder());

    }

}
