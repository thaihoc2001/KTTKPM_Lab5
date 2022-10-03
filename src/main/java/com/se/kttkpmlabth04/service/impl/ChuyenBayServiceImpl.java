package com.se.kttkpmlabth04.service.impl;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import com.se.kttkpmlabth04.repository.ChuyenBayRepository;
import com.se.kttkpmlabth04.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
    
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
    
    @Override
    public List<ChuyenBay> cau1(String place) {
        return this.chuyenBayRepository.getChuyenBaysByGadi("DAD");
    }
    
    @Override
    public List<ChuyenBay> cau4(int less, int than) {
        return this.chuyenBayRepository.getChuyenBaysByDodaiLessThanAndDodaiGreaterThan(less, than);
    }
    
    @Override
    public List<ChuyenBay> cau5(String gaDi, String gaDen) {
        return this.chuyenBayRepository.getChuyenBaysByGadiAndGaden(gaDi, gaDen);
    }
    
    @Override
    public Integer cau6(String gaDi) {
        return this.chuyenBayRepository.countChuyenBayByGadi(gaDi);
    }
}
