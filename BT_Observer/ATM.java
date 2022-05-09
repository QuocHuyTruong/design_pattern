/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Observer;

/**
 *
 * @author DELL
 */
public class ATM {
    private ITaiKhoanATM taikhoan;
    
    public void attach(ITaiKhoanATM taikhoan){
        this.taikhoan=taikhoan;
    }
    
    public void detach(ITaiKhoanATM taikhoan){
        this.taikhoan=null;
    }
    
    public boolean kttienrut(int sotienrut){
        return taikhoan.ktsodu(sotienrut);
    }
    
    public void ruttien(int sotienrut){
        if(kttienrut(sotienrut)){
            taikhoan.thongbao(sotienrut, true);
        }
        else{
            taikhoan.thongbao(sotienrut, false);
        }
    }
    
    
    
    static public interface ITaiKhoanATM{
        boolean ktsodu(int sotienrut);
        void thongbao(int sotienrut, boolean thanhcong);
    }
}
