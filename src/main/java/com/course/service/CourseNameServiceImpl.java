package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.course.entity.CourseName;
import com.course.repo.CourseNameRepository;
import com.course.request.SearchRequest;
@Service
public class CourseNameServiceImpl implements CourseNameService {

	@Autowired
	private CourseNameRepository repo;
	
	@Override
	public List<String> getCourseNames() {
		// TODO Auto-generated method stub
		return repo.getCourseNames();
	}

	@Override
	public List<String> getBookNames() {
		// TODO Auto-generated method stub
		return repo.getBookNames();
	}

	@Override
	public List<CourseName> search(SearchRequest request) {
		CourseName entity = new CourseName();
		if(null!=request.getCourseName()&& !"".equals(request.getCourseName())) {
			entity.setCourseName(request.getCourseName());
		}
		
		if(null!=request.getBookName()&& !"".equals(request.getBookName())) {
			entity.setBookName(request.getBookName());
		}
		
		if(null!=request.getBookPrice() && !"".equals(request.getBookPrice())) {
			entity.setBookPrice(request.getBookPrice());
		}
		
		return repo.findAll(Example.of(entity));
	}

	@Override
	public List<Double> getBookPrice() {
		// TODO Auto-generated method stub
		return repo.getBookPrices();
	}

}
