package com.se.kttkpmlabth04.repository;

import com.se.kttkpmlabth04.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
    @Query(value = "select * from MayBay where tamBay > ? ",nativeQuery = true)
    List<MayBay> findMayBayByTamBay(int tambay);
}
