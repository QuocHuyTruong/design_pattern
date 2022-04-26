/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaTap_Decorator;

/**
 *
 * @author DELL
 */
public abstract class BieuThucDecorator extends BieuThuc{

    BieuThuc bieuthuc;

    public BieuThucDecorator(BieuThuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }
}
