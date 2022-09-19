package com.se.kttkpmlabth04.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Setter
@Getter
public class ChungNhanId implements Serializable {
    private String manv;
    
    private String mamb;
    
}
