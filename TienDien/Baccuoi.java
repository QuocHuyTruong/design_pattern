/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienDien;

/**
 *
 * @author DELL
 */
public class Baccuoi implements ITinhTien{
    float tien;
    int min;

    public Baccuoi(float tien, int min) {
        this.tien = tien;
        this.min = min;
    }

    @Override
    public ITinhTien thietlapcaohon(ITinhTien tinhtien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float tinhtien(float sodien) {
       return (sodien-min)*tien;
    }
    
}
