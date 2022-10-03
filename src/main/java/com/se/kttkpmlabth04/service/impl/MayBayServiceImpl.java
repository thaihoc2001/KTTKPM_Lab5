package com.se.kttkpmlabth04.service.impl;

import com.se.kttkpmlabth04.entity.MayBay;
import com.se.kttkpmlabth04.entity.Nhanvien;
import com.se.kttkpmlabth04.repository.MayBayRepository;
import com.se.kttkpmlabth04.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayServiceImpl implements MayBayService {
    
    @Autowired
    private MayBayRepository mayBayRepository;
    
    @Override
    public List<MayBay> cau2(int tamBay) {
        return this.mayBayRepository.findMayBayByTamBay(tamBay);
    }
    
    @Override
    public Integer cau7(String loaiMB) {
        return this.mayBayRepository.countMayBayByLoai(loaiMB);
    }
    
    @Override
    public List<Integer> cau11() {
        return this.mayBayRepository.findMaMBByTenNV();
    }
    
    
}
