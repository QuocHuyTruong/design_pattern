/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienDien;

/**
 *
 * @author DELL
 */
public class TinhTien implements ITinhTien{
    float tien;
    int min;
    int max;
    ITinhTien caohon;
    float tongtien=0;

    public TinhTien(float tien, int min, int max) {
        this.tien = tien;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITinhTien thietlapcaohon(ITinhTien tinhtien) {
        caohon = tinhtien;
        return tinhtien;
    }

    @Override
//    public String tinhtien(float sodien) {
//        if(sodien >= min && sodien <= max){
//            return "" + sodien*tien;
//        }else{
//            return caohon.tinhtien(sodien);
//        }
//    }
    public String tinhtien(float sodien) {
        if(sodien <= max){
            tongtien = tongtien + (sodien-min)*tien;
            return "" + tongtien;
        }else{
            tongtien = tongtien + (max-min)*tien;
            return "" + tongtien;
        }
//      caohon.tinhtien(sodien);
    }
    
}
