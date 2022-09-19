package com.se.kttkpmlabth04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import com.se.kttkpmlabth04.entity.MayBay;
import com.se.kttkpmlabth04.repository.ChuyenBayRepository;
import com.se.kttkpmlabth04.repository.MayBayRepository;

@Service
@Transactional
public class ChuyenBayService{
	@Autowired
    MayBayRepository mayBayRepository;
    public List<MayBay> getChuyenBay(int tamBay) {
        return mayBayRepository.findMayBayByTamBay(tamBay);
    }
}
