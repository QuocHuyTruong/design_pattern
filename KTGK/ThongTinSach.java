/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK;


/**
 *
 * @author DELL
 */
public class ThongTinSach {
    private String tuade;
    private int sotrang;
    private String tacgia;

    public ThongTinSach(String tuade, int sotrang, String tacgia) {
        this.tuade = tuade;
        this.sotrang = sotrang;
        this.tacgia = tacgia;
    }

    public String getTuade() {
        return tuade;
    }

    public void setTuade(String tuade) {
        this.tuade = tuade;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    @Override
    public String toString() {
        return "ThongTinSach{" + "tuade=" + tuade + ", sotrang=" + sotrang + ", tacgia=" + tacgia + '}';
    }  
}
