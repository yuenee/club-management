package com.example.clubmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/club")
public class ClubController {
	
	@GetMapping("/list")
	public String getClubList() {
		return "/club-list";
	}
	
	@GetMapping("/detail")
	public String getClubDetail() {
		return "/club-detail";
	}
	
	@GetMapping("/edit")
	public String getClubedit() {
		return "/club-edit";
	}

}
