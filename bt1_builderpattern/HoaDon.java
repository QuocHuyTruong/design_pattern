/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1_builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDon {
    HoaDonHeader HD;
    List<CTHD> CTHD = new ArrayList<>();

    private HoaDon(Builder builder) 
    {
        this.HD = builder.HDH;
        this.CTHD = builder.DSCTHD;
    }
    public static class Builder
    {
        HoaDonHeader HDH;
        ArrayList<CTHD> DSCTHD = new ArrayList<>();

        public Builder() 
        {}
        
        public Builder addHoaDonHeader(HoaDonHeader HDH)
        {
            this.HDH = HDH;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd)
        {
            this.DSCTHD.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() 
    {
        String s = HD.toString();
        for(int i=0; i < CTHD.size(); i++)
        {
            s += "\n" + CTHD.get(i).toString();
        }
        return s;
    }
    
    
}
