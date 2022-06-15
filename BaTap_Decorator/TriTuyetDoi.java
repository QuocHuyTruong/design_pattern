/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaTap_Decorator;

/**
 *
 * @author DELL
 */
public class TriTuyetDoi extends BieuThucDecorator{
    public TriTuyetDoi(BieuThuc bieuthuc) {
        super(bieuthuc);
    }

    @Override
    public float giaTri() {
        if(bieuthuc.giaTri()<0){
            return bieuthuc.giaTri() * -1;
        }
        return bieuthuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return "|"+ bieuthuc.bieuThuc()+ "|";
    }
}
