package com.bikestores.bikestoresapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikestores.bikestoresapi.model.Staff;
import com.bikestores.bikestoresapi.repository.StaffRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/staff/v1")
@RestController
@ResponseBody
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    @GetMapping("/staffs")
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    @GetMapping("/staff/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable Long id) {
        Staff staff = staffRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(staff);
    }
        
}
