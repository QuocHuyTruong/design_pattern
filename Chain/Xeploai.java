/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author DELL
 */
public class Xeploai implements IxepLoai{
    String nhan;
    float min;
    IxepLoai caohon;
    public Xeploai(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }
    
    @Override
    public IxepLoai thietlapcaohon(IxepLoai xeploai) {
        caohon=xeploai;
        return xeploai;
    }

    @Override
    public String xeploai(float diem) {
        if(diem>=min){
            return nhan;
        }
        else{
            return caohon.xeploai(diem);
        }
    }
    
    
}
