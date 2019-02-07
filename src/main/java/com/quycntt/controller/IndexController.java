package com.quycntt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.quycntt.serviceimp.CategoryServiceImp;

@Controller
public class IndexController {
	
	@Autowired
	private CategoryServiceImp categoryServiceImp;
	
	@GetMapping("/")
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("categories", categoryServiceImp.findAll());
		return "index";
	}
}
