/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Observer;

/**
 *
 * @author DELL
 */
public class BT_ObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM a = new ATM();
        TaiKhoan t = new TaiKhoan(100);
        a.attach(t);
        a.ruttien(10);
        a.ruttien(10);
//        System.out.println(t.ktsodu(90));
//        System.out.println(a.kttienrut(90));
    }
    
}
