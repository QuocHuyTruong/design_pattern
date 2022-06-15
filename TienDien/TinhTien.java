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
    float tongtien =0;

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
    public float success(float sodien){
        return caohon.tinhtien(sodien);
    }

    @Override
    public float tinhtien(float sodien) {
        if(sodien <= max){
            return (sodien-min)*tien;
        }else{
            return (max-min)*tien + success(sodien);
        }
    }

    
}
