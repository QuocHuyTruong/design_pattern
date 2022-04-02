/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1_builderpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL
 */
public class bt1_BuilderMain {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     * 
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        HoaDonHeader HDH = new HoaDonHeader
        ("HD001", new SimpleDateFormat("dd/mm/yyyy").parse("02/04/2022"),"Truong Quoc Huy");
        CTHD CTHD1 = new CTHD("Keyboard",2,1000000,0.2);
        CTHD CTHD2 = new CTHD("Headphone",2,2500000,0.3);
        CTHD CTHD3 = new CTHD("Laptop",1,15000000,0.5);
        CTHD CTHD4 = new CTHD("USB",7,999000,0.5);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CTHD1)
            .addCTHD(CTHD2)
            .addCTHD(CTHD3)
            .addCTHD(CTHD4)
            .build();
//        System.out.println(HDH.toString());
        System.out.println(HD.toString());
    }
    
}
