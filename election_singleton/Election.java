/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package election_singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Election {
    private static Election intance;
    int dol =0;
    int joe =0;
    List<String> users = new ArrayList();
    private Election(){
        
    }
    public static Election getIntance(){
        if(intance==null){
           intance = new Election();
        }
        return intance;
    }
    public void Vote(Canadidate canadidate, User user){
        if(users.contains(user.name)){
            return;
        }
        if(canadidate==Canadidate.Donaltrum){
            dol++;
            users.add(user.name);
        }
        else if(canadidate==Canadidate.Joebiden){
            joe++;
            users.add(user.name);
        }
    }
    public int getJoe(){
        return joe;
    }
    public int getDol(){
        return dol;
    }
}
