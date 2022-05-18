package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Cloth;
import com.example.repository.ClothRepository;

@Service
@Transactional
public class ClothService {
	@Autowired
	private ClothRepository repository;
	
	public List<Cloth> findByGenderColor(Integer gender,String color){
		return repository.findByGenderColor(gender, color);
	}
}
