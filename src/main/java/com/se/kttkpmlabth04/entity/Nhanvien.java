package com.se.kttkpmlabth04.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Nhanvien {
    @Id
    private String manv;
    
    private String ten;
    
    private double luong;
}
