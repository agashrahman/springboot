package com.example.demo.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDto;
import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
	
	@Service

public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public boolean saveOrUpdate(AdminDto dto) {
		Admin ad =new Admin();
		ad.setId(dto.getId());
		ad.setName(dto.getName());
		ad.setDept(dto.getDept());
		adminRepository.save(ad);
		return true;
	}
	

}
