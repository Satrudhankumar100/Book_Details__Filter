package com.course.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.course.entity.CourseName;

public interface CourseNameRepository extends JpaRepository<CourseName, Integer> {
	
	@Query("select distinct(courseName) from CourseName")
	public List<String> getCourseNames();
	
	@Query("select distinct(bookName) from CourseName")
	public List<String> getBookNames();
	
	@Query("select distinct(bookPrice) from CourseName")
	public List<Double> getBookPrices();

}
