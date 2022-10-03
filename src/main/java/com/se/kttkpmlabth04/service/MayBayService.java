package com.se.kttkpmlabth04.service;

import com.se.kttkpmlabth04.entity.MayBay;
import com.se.kttkpmlabth04.entity.Nhanvien;

import java.util.List;

public interface MayBayService {
    List<MayBay> cau2(int tamBay);
    
    Integer cau7(String loaiMB);
    
    List<Integer> cau11();
}
