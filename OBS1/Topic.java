/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBS1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Topic {
    List<IThanhvien> thanhvien = new ArrayList();
    List<String> list = new ArrayList();
    
    public void attach(IThanhvien o){
        if(!thanhvien.contains(o)){
            thanhvien.add(o);
        }
    }
    
    public void detach(IThanhvien o){
        if(thanhvien.contains(o)){
            thanhvien.remove(o);
        }
    }
    
    public void taotin(String tin){
        list.add(tin);
//        capnhat();
    }
    
     public void capnhat(){
//        thanhvien.intin(list);
        for(IThanhvien tv : thanhvien){
            tv.intin(list);
        }
    }
    
    static public interface IThanhvien{
        void intin(List<String> tin);
    }
}
