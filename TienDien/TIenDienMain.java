/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TienDien;

/**
 *
 * @author DELL
 */
public class TIenDienMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ITinhTien bac1 = new TinhTien((float)1.678, 0, 50);
        ITinhTien bac2 = new TinhTien((float)1.734, 51, 100);
        ITinhTien bac3 = new TinhTien((float)2.014, 101, 200);
        ITinhTien bac4 = new TinhTien((float)2.536, 201, 300);
        ITinhTien bac5 = new TinhTien((float)2.834, 301, 400);
        ITinhTien bac6 = new TinhTien((float)2.927, 401, 1000);
        
        bac1.thietlapcaohon(bac2).thietlapcaohon(bac3).thietlapcaohon(bac4).thietlapcaohon(bac5).thietlapcaohon(bac6);
        System.out.println(bac1.tinhtien(51));
        
        ITinhTien bac = new TinhTienTraTruoc((float)2.461);
        System.out.println(bac.tinhtien(10));
    }
    
}
