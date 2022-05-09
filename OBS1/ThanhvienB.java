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
public class ThanhvienB implements Topic.IThanhvien{
    
    @Override
    public void intin(List<String> tin) {
        for(int i=0; i < tin.size(); i++)
        {
            System.out.println(i + " " + tin.get(i));
        }
    }
}
