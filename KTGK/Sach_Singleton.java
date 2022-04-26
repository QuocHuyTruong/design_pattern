/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK;

/**
 *
 * @author DELL
 */
public class Sach_Singleton {
    private static SachBuilder sachBuilder;
  
    public static SachBuilder create(){
        if(sachBuilder==null){
            ThongTinSach tts = new ThongTinSach("mau thiet ke", 10, "tac gia");
            DSChuong dsc1 = new DSChuong("Chuong1");
            DSChuong dsc2 = new DSChuong("Chuong2");
            DSChuong dsc3 = new DSChuong("Chuong3");
            SachBuilder sachBuilder = new SachBuilder.Builder()
                .addThongTinSach(tts)
                .addDSCHuong(dsc3)
                .addDSCHuong(dsc2)
                .addDSCHuong(dsc1)
                .build();
        }
        return sachBuilder;
    }
    
    
    
}
