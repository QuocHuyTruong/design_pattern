/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chain;

/**
 *
 * @author DELL
 */
public class XeploaiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IxepLoai xuatsac = new Xeploai("xuatsac",9);
        IxepLoai gioi = new Xeploai("gioi",8);
        IxepLoai kha = new Xeploai("kha",7);
        IxepLoai tb = new Xeploai("tb",5);
        IxepLoai yeukem = new Xeploai("yeukem",0);
        
        xuatsac.thietlapcaohon(gioi).thietlapcaohon(kha).thietlapcaohon(tb).thietlapcaohon(yeukem);
        System.out.println("6.5" + xuatsac.xeploai((float)6.5));
        
    }
    
}
