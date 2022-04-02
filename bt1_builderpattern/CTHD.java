/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1_builderpattern;

/**
 *
 * @author DELL
 */
public class CTHD {
    private String sanpham;
    private int soluong;
    private double dongia;
    private double chietkhau;

    public CTHD(String sanpham, int soluong, double dongia, double chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }
    public CTHD(){}

    public String getSanpham() {
        return sanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public double getChietkhau() {
        return chietkhau;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setChietkhau(double chietkhau) {
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "sanpham=" + sanpham + ", soluong=" + soluong + ", dongia=" + dongia + ", chietkhau=" + chietkhau + '}';
    }
    
}
