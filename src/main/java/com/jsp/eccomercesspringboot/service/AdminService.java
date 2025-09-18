package com.jsp.eccomercesspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.eccomercesspringboot.entity.Admin;
import com.jsp.eccomercesspringboot.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository arepo;
//	save Method..
	public void save(Admin a) {
		arepo.save(a);
	}
//	fetch All
	public List<Admin> fetchAll(){
		return arepo.findAll();
	}
	
	

}
