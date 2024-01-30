package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdminDto;
import com.example.demo.service.AdminService;

	@RestController
	@CrossOrigin("*")

public class AdminController {
	@Autowired
	AdminService adminService;
	@PostMapping("/save")
	public boolean saveOrUpdate(@RequestBody AdminDto dto) {
		return adminService.saveOrUpdate(dto);
		
	}
}
