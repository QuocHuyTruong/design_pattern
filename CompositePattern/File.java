/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePattern;

/**
 *
 * @author DELL
 */
public class File extends AbstracFile{

    public File(String path, String name, String ngay) {
        super(path, name, ngay);
    }
   

    @Override
    public void add(AbstracFile file) {
    }

    @Override
    public void remove(AbstracFile file) {
    }

    @Override
    public String getStringTreeFolder() {
        return preStr + name;
    }
    
}
