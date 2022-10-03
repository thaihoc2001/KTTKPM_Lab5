package com.se.kttkpmlabth04.repository;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    List<ChuyenBay> getChuyenBaysByGadi(String gadi);
    
    List<ChuyenBay> getChuyenBaysByDodaiLessThanAndDodaiGreaterThan(int less,int than);
    
    List<ChuyenBay> getChuyenBaysByGadiAndGaden(String gaDi,String gaDen);
    
    Integer countChuyenBayByGadi(String gaDi);
}
