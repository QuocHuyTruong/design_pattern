/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaTap_Decorator;

/**
 *
 * @author DELL
 */
public class BaiTap_DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BieuThuc b = new BieuThucDonGian(8);
       b = new Tru(9, b);
       b =new Tru(8, b);
       b =new Tru(8, b);
       b = new TriTuyetDoi(b);
       b =new Tru(8, b);
       System.out.println(b.bieuThuc()+ "=" + b.giaTri());
    }
    
}
