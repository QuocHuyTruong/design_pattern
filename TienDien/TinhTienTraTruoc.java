/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienDien;

/**
 *
 * @author DELL
 */
public class TinhTienTraTruoc implements ITinhTien{
    
    float tien;

    public TinhTienTraTruoc(float tien) {
        this.tien = tien;
    }
    
    

    @Override
    public ITinhTien thietlapcaohon(ITinhTien tinhtien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String tinhtien(float sodien) {
        return ""+ sodien*tien;
    }
    
}
