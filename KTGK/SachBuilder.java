/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTGK;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SachBuilder {
    ThongTinSach TTS;
    List<DSChuong> DSC = new ArrayList<>();
    private SachBuilder(Builder builder) 
    {
        this.TTS = builder.TT;
        this.DSC = builder.DS;
    }


    public static class Builder
    {
        ThongTinSach TT;
        ArrayList<DSChuong> DS = new ArrayList<>();

        public Builder() 
        {}
        
        public Builder addThongTinSach(ThongTinSach TTS)
        {
            this.TT = TTS;
            return this;
        }
        
        public Builder addDSCHuong(DSChuong DSC)
        {
            this.DS.add(DSC);
            return this;
        }
        
        public SachBuilder build()
        {
            return new SachBuilder(this);
        }
    }

    public String HienThi() {
        String s = TTS.toString();
        for(int i=0; i < DSC.size(); i++)
        {
            s += "\n" + DSC.get(i).toString();
        }
        return s;
    }
    
}
