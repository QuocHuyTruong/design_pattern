/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePattern;

/**
 *
 * @author DELL
 */
public abstract class AbstracFile {
    String path;
    String name,ngay;
    String preStr=" "; 

    public AbstracFile(String path, String name, String ngay) {
        this.path = path;
        this.name = name;
        this.ngay = ngay;
    }
    abstract public void add(AbstracFile file);
    abstract public void remove(AbstracFile file);
    abstract public String getStringTreeFolder();
    
    
    public String getPath() {
        return path;
    }
}
