package com.se.kttkpmlabth04.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "chungnhan")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChungNhan {
    @EmbeddedId
    private ChungNhanId chungNhanId;
    
    @MapsId("manv")
    @ManyToOne
    @JoinColumn(name = "mamb")
    private MayBay mayBay;
    
    @MapsId("manv")
    @ManyToOne
    @JoinColumn(name = "manv")
    private Nhanvien nhanVien;
}
