package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Hotel;
import com.example.service.HotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelService service;
	
	@RequestMapping("")
	public String index() {
		return "hotel";
	}

	@RequestMapping("/input")
	public String input(Integer price,Model model) {
		List<Hotel> hotelList=service.findprice(price);
		model.addAttribute("hotelList", hotelList);
		return "hotel";
	}
}
