/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateQLSV;

/**
 *
 * @author DELL
 */
public class QLSinhVien extends QLData<SinhVien>{

    @Override
    protected int khoa(SinhVien t) {
        return t.id;
    }

    @Override
    public void hienThi(SinhVien t) {
        System.out.println(t.mssv);
        System.out.println(t.ten);
        System.out.println(t.ngaysinh);
        System.out.println(t.quequan);
    }
    
    
}
