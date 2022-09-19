package com.se.kttkpmlabth04;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import com.se.kttkpmlabth04.repository.ChuyenBayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChuyenBayTest {
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
    
    @Test
    public void cau1(){
        List<ChuyenBay> list=this.chuyenBayRepository.getChuyenBaysByGadi("DAD");
        System.out.println(list);
    }
}
