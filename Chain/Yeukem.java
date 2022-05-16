/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;


/**
 *
 * @author DELL
 */
public class Yeukem implements IxepLoai{
    
    String nhan;
    float min;

    public Yeukem(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }
    
    
    @Override
    public IxepLoai thietlapcaohon(IxepLoai xeploai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String xeploai(float diem) {
        if(diem>=min){
            return nhan;
        }else{
            return "diem ngoai pham vi";
        }
    }
}
