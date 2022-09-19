package com.se.kttkpmlabth04.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MayBay {
    @Id
    private Integer mamb;
    
    private String loai;
    
    @Column(name = "tambay")
    private int tamBay;
}
