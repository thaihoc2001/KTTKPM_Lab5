package com.se.kttkpmlabth04.controller;

import com.se.kttkpmlabth04.service.NhanVienService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nhanvien/")
public class NhanVienController {
    
    @Autowired
    private NhanVienService nhanVienService;
    
    @GetMapping("/cau3/{luong}")
    @Operation(summary = "cau3")
    public ResponseEntity<Object> cau3(@PathVariable double luong) {
        return ResponseEntity.ok().body(this.nhanVienService.cau3(luong));
    }
    
    @GetMapping("/cau8")
    @Operation(summary = "cau8")
    public ResponseEntity<Object> cau8() {
        return ResponseEntity.ok().body(this.nhanVienService.cau8());
    }
    
    @GetMapping("/cau9")
    @Operation(summary = "cau9")
    public ResponseEntity<Object> cau9() {
        return ResponseEntity.ok().body(this.nhanVienService.cau9());
    }
    
    @GetMapping("/cau10/{mamb}")
    @Operation(summary = "cau10")
    public ResponseEntity<Object> cau10(@PathVariable int mamb) {
        return ResponseEntity.ok().body(this.nhanVienService.cau10(mamb));
    }
    
    @GetMapping("/cau12")
    @Operation(summary = "cau12")
    public ResponseEntity<Object> cau12() {
        return ResponseEntity.ok().body(this.nhanVienService.cau12());
    }
}
