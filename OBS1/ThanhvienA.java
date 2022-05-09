/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBS1;

import java.util.List;

/**
 *
 * @author DELL
 */
public class ThanhvienA implements Topic.IThanhvien{

    @Override
    public void intin(List<String> tin) {
        System.out.println(tin.get(tin.size()-1));
    }
    
}
