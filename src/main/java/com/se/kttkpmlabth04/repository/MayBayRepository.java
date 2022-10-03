package com.se.kttkpmlabth04.repository;

import com.se.kttkpmlabth04.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
    @Query(value = "select * from MayBay where tamBay > ?1 ",nativeQuery = true)
    List<MayBay> findMayBayByTamBay(int tambay);
    
    Integer countMayBayByLoai(String loaiMB);
    
    @Query(value = "select mb.mamb from maybay mb join chungnhan cn on cn.mamb=mb.mamb" +
            " join nhanvien nv on nv.manv=cn.manv " +
            "where nv.ten like '%Nguyen%'", nativeQuery = true)
    List<Integer> findMaMBByTenNV();
}
