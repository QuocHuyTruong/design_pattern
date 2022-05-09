/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Observer;

/**
 *
 * @author DELL
 */
public class TaiKhoan implements ATM.ITaiKhoanATM{
    public int sodu;
    public TaiKhoan(int sodu) {
        this.sodu = sodu;
    }
    
    @Override
    public boolean ktsodu(int sotienrut){
        if(sodu>=sotienrut){
            sodu=sodu-sotienrut;
            return true;
        }else{
           return false; 
        }
        
    }

    @Override
    public void thongbao(int sotienrut, boolean thanhcong) {
        System.out.println("so tien rut "+ sotienrut+ thanhcong + sodu);
    }
    
}
