package com.se.kttkpmlabth04;

import com.se.kttkpmlabth04.entity.Nhanvien;
import com.se.kttkpmlabth04.repository.NhanVienRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NhanvienTest {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    
    @Test
    public void cau3() {
        this.nhanVienRepository.getAllByLuongLessThan(10000).forEach(System.out::println);
        
    }
}
