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
    private int[] mang={1,2,3,4,5,6,7,8,9710};
    
    public int getItem(int i){
        return mang[i];
    }
    public int count(){
        return mang.length;
    }
    
    public MyIterator create(){
        return new ArrayIterator(this);
    }
}
