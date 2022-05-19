/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateQLSV;



/**
 *
 * @author DELL
 */
public class QLSinhVienMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLData<SinhVien> qlsv = new QLSinhVien();
        SinhVien sv1 = new SinhVien(0, "123", "quang", "khong nho", "khong biet nua");
        SinhVien sv2 = new SinhVien(1, "234", "tran", "khong nho", "khong biet nua");
        SinhVien sv3 = new SinhVien(2, "345", "nhat", "khong nho", "khong biet nua");
        SinhVien sv4 = new SinhVien(3, "456", "minh", "khong nho", "khong biet nua");
        SinhVien sv5 = new SinhVien(4, "567", "hau", "khong nho", "khong biet nua");
        SinhVien sv6 = new SinhVien(5, "678", "hiep", "khong nho", "khong biet nua");
        
        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        qlsv.them(sv4);
        qlsv.them(sv5);
        qlsv.them(sv6);
        SinhVien svcapnhat = new SinhVien(5, "000", "hiep", "khong nho", "khong biet nua");
        qlsv.capnhat(svcapnhat);
        
        qlsv.hienthi();
    }
}
