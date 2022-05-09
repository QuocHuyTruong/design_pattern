/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author DELL
 */
public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }
    public void huyDangKy(){
        t.attach(this);
    }
    @Override
    public void capNhatTiGia(float delta){
        if(delta>0){
            System.out.println("");
        }else{
            if(delta==0){
                System.out.println("");
            }else{
                System.out.println("");
            }
        }
    }
}
