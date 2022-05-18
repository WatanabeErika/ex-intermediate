package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Baseball;
import com.example.service.BaseballService;

@Controller
@RequestMapping("/baseball")
public class BaseballController {
	@Autowired
	private BaseballService service;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Baseball> baseList=service.findAll();
		model.addAttribute("baseList",baseList );
		return "baseball";
	}
	
	@RequestMapping("/baseball-detail")
	public String baseballDetail(Integer id,Model model) {
		Baseball baseball=service.load(id);
		
		model.addAttribute("baseball", baseball);
		
		return "baseball-detail";
	}
}
