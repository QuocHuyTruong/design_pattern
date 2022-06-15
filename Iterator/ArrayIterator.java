/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DELL
 */
public class ArrayIterator implements MyIterator{
    ArrayAggregate arrayAggregate;
    
    int index=0;
    
    public ArrayIterator(ArrayAggregate arrayAggregate) {
        this.arrayAggregate = arrayAggregate;
    }
    
    @Override
    public Object first(){
        index = 0;
        return arrayAggregate.getItem(index);
    }
    
    @Override
    public Object next(){
        if(!isDone())
            return arrayAggregate.getItem(index);
        return null;
    }
    
    @Override
    public  Boolean isDone(){
        return !(index<arrayAggregate.count()-1);
    }

    @Override
    public Object currentItem() {
        return null;
    }
    
}
