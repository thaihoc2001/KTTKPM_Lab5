package com.se.kttkpmlabth04.service.impl;

import com.se.kttkpmlabth04.entity.Nhanvien;
import com.se.kttkpmlabth04.repository.NhanVienRepository;
import com.se.kttkpmlabth04.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    
    @Autowired
    private NhanVienRepository nhanVienRepository;
    
    @Override
    public List<Nhanvien> cau3(double luong) {
        return this.nhanVienRepository.getAllByLuongLessThan(luong);
    }
    
    @Override
    public Double cau8() {
        return this.nhanVienRepository.getTongLuongPhaiTra();
    }
    
    @Override
    public List<String> cau9() {
        return this.nhanVienRepository.getManvFromMaybay();
    }
    
    @Override
    public List<Nhanvien> cau10(int maMB) {
        return this.nhanVienRepository.getNhanvienByMaMB(maMB);
    }
    
    @Override
    public List<String> cau12() {
        return this.nhanVienRepository.getManvFrom2LoaiMayBay();
    }
}
