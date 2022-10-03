package com.se.kttkpmlabth04.service;

import com.se.kttkpmlabth04.entity.Nhanvien;

import java.util.List;

public interface NhanVienService {
    List<Nhanvien> cau3(double luong);
    
    Double cau8();
    
    List<String> cau9();
    
    List<Nhanvien> cau10(int maMB);
    
    List<String> cau12();
    
}
