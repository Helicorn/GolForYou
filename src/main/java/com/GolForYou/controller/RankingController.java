package com.GolForYou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RankingController {
	
	//랭킹 메인페이지
	@GetMapping("/ranking")
	public ModelAndView ranking() {
		
		
		
		ModelAndView rm = new ModelAndView();
		
		return rm;
	}
}
