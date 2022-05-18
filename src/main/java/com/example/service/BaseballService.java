package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Baseball;
import com.example.repository.BaseballRepository;

@Service
@Transactional
public class BaseballService {
	@Autowired
	private BaseballRepository repository;
	
	public Baseball load(Integer id) {
		return repository.load(id);
	}
	
	public List<Baseball> findAll() {
		return repository.findAll(); 
	}

}
