package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.course.entity.CourseName;
import com.course.request.SearchRequest;
import com.course.service.CourseNameService;

@Controller
public class CourseNameController {

	@Autowired
	private CourseNameService service;
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("search",new SearchRequest());
		init(model);
		return "index";
	}
	
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search") SearchRequest search,Model model) {
		List<CourseName> bookDetails = service.search(search);
		model.addAttribute("bookDetails",bookDetails);
		init(model);
		return "index";
	}
	
	
	private void init(Model model) {
		model.addAttribute("courseNames",service.getCourseNames());
		model.addAttribute("bookNames",service.getBookNames());
		model.addAttribute("bookPrice",service.getBookPrice());
	}
}
