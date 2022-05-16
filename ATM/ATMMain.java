/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ATM;

/**
 *
 * @author DELL
 */
public class ATMMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IXepTien mottram = new XepTien(100, 0);
        IXepTien nammuoi = new XepTien(50, 0);
        IXepTien haimuoi = new XepTien(20, 0);
        IXepTien nam = new XepTien(5, 0);
        mottram.thietlapcaohon(nammuoi).thietlapcaohon(haimuoi).thietlapcaohon(haimuoi).thietlapcaohon(nam);
        System.out.println(mottram.xeptien(2675));
        
        
    }
    
}
