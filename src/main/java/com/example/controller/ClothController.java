package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Cloth;
import com.example.service.ClothService;

@Controller
@RequestMapping("/cloth")
public class ClothController {
	@Autowired
	private ClothService service;
	
	@RequestMapping("")
	public String index() {
		return "cloth";
	}
	
	@RequestMapping("/result")
	public String result(Integer gender,String color,Model model) {
		List<Cloth> clothList=service.findByGenderColor(gender, color);
		model.addAttribute("clothList", clothList);
		return "cloth";
	}
}
