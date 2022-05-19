/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DELL
 */
public class ArrayAggregate {
    int[] mang;
    
    public MyIterator create(){
        return new ArrayIterator(this);
    }
}
