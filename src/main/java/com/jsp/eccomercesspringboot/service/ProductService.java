package com.jsp.eccomercesspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.eccomercesspringboot.entity.Product;
import com.jsp.eccomercesspringboot.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo;
//	save Method product
	public void saveProduct(Product p) {
		prepo.save(p);
	}
//	find All
	public List<Product> getAll() {
		return prepo.findAll();
		
	}
//	delete by id
	public void deletebyId(Long id) {
		prepo.deleteById(id);
		
	}
//	FetchById
	public Optional<Product> fetchbyId(long id) {
		return prepo.findById(id);
		
	}
//	
	public List<Product> getProByCatId(int id) {
		return prepo.findAllByCategory_Id(id);
		
	}

}
