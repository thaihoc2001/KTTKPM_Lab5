package com.se.kttkpmlabth04;

import com.se.kttkpmlabth04.entity.MayBay;
import com.se.kttkpmlabth04.repository.MayBayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayTest {
    @Autowired
    private MayBayRepository mayBayRepository;
    
    @Test
    public void cau2(){
        List<MayBay> mayBays=mayBayRepository.findMayBayByTamBay(10000);
        System.out.println(mayBays);
    }
}
