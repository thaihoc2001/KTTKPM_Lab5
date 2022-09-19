package com.se.kttkpmlabth04;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import com.se.kttkpmlabth04.entity.MayBay;
import com.se.kttkpmlabth04.repository.MayBayRepository;
import com.se.kttkpmlabth04.service.ChuyenBayService;

@SpringBootApplication
public class KttkpmLabTh04Application {
    public static void main(String[] args) {
        SpringApplication.run(KttkpmLabTh04Application.class, args);
        ChuyenBayService chuyenBayService = new ChuyenBayService();
        List<MayBay> dsChuyenBay = chuyenBayService.getChuyenBay(100);
        System.out.println(dsChuyenBay);
    }
    
}
