/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author DELL
 */
public class XepTien implements IXepTien{
    int tien;
    int min;
    IXepTien caohon;
    int soto;
    int tiendu;
    public XepTien(int tien, int min) {
        this.tien = tien;
        this.min = min;
    }

    @Override
    public IXepTien thietlapcaohon(IXepTien xeptien) {
        caohon = xeptien;
        return xeptien;
    }

    @Override
    public  String xeptien(int sotien) {
        
        if(sotien>=tien){
            sotien=sotien-tien;
            System.out.println(tien);
            return xeptien(sotien);
            
        }else if(sotien==0){
            return "";
        }else{
            return caohon.xeptien(sotien);
        }
        

    }    
}
