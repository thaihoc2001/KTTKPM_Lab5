package com.se.kttkpmlabth04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.se.kttkpmlabth04.entity.Nhanvien;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<Nhanvien, String> {
    List<Nhanvien> getAllByLuongLessThan(double luong);
    
    @Query(value = "select sum (n.luong) as tongluong from nhanvien n ", nativeQuery = true)
    Double getTongLuongPhaiTra();
    
    @Query(value = "select n.manv from nhanvien n join chungnhan cn on n.manv=cn.manv" +
            " join maybay mb on cn.mamb=mb.mamb " +
            "where mb.loai like '%Boeing%'", nativeQuery = true)
    List<String> getManvFromMaybay();
    
    @Query(value = "select * from nhanvien n join chungnhan cn on n.manv=cn.manv" +
            " join maybay mb on cn.mamb=mb.mamb " +
            "where mb.mamb= :maMB", nativeQuery = true)
    List<Nhanvien> getNhanvienByMaMB(@Param("maMB") int maMB);
    
    @Query(value = "select n.manv from nhanvien n join chungnhan cn on n.manv=cn.manv join maybay mb\n" +
            "on cn.mamb=mb.mamb where mb.loai like '%Boeing%' or mb.loai like '%Airbus%'" +
            "group by n.manv", nativeQuery = true)
    List<String> getManvFrom2LoaiMayBay();
}
