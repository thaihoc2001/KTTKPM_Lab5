package com.se.kttkpmlabth04.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "chuyenbay")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChuyenBay {
    @Id
    private String macb;
    
    private String gadi;
    
    private String gaden;
    
    private int dodai;
    
    private Date giodi;
    
    private Date gioden;
    
    private double chiphi;
}
