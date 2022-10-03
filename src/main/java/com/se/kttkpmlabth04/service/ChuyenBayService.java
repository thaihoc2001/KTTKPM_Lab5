package com.se.kttkpmlabth04.service;

import com.se.kttkpmlabth04.entity.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    List<ChuyenBay> cau1(String place);
    
    List<ChuyenBay> cau4(int less,int than);
    
    List<ChuyenBay> cau5(String gaDi,String gaDen);
    
    Integer cau6(String gaDi);
}
