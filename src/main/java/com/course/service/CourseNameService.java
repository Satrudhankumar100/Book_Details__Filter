package com.course.service;

import java.util.List;

import com.course.entity.CourseName;
import com.course.request.SearchRequest;

public interface CourseNameService {
	
	List<String> getCourseNames();
	
	List<String> getBookNames();
	
	List<Double> getBookPrice();
	
	List<CourseName> search(SearchRequest request);
	
			
}
