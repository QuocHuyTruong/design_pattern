/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KTGK;

/**
 *
 * @author DELL
 */
public class KTGK_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThongTinSach tts = new ThongTinSach("mau thiet ke", 10, "tac gia");
        DSChuong dsc1 = new DSChuong("Chuong1");
        DSChuong dsc2 = new DSChuong("Chuong2");
        DSChuong dsc3 = new DSChuong("Chuong3");
        SachBuilder SB = new SachBuilder.Builder()
                .addThongTinSach(tts)
                .addDSCHuong(dsc3)
                .addDSCHuong(dsc2)
                .addDSCHuong(dsc1)
                .build();
        System.out.println(SB.HienThi());
    }
    
}
