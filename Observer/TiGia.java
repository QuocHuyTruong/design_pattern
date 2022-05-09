/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TiGia {
    List<I_TheoDoiTiGia> observer = new ArrayList();
    float tigia;
    public void attach(I_TheoDoiTiGia o){
        if(observer.contains(o)){
            observer.add(o);
        }
    }
    public void detach(I_TheoDoiTiGia o){
        if(observer.contains(o)){
            observer.remove(o);
        }
    }
    public void notifi(float delta){
        tigia+=delta;
        for(I_TheoDoiTiGia thaydoi : observer){
            thaydoi.capNhatTiGia(tigia);
        }
    }
    static public interface I_TheoDoiTiGia{
        void capNhatTiGia(float delta);
    }
}
