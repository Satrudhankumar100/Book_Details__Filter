package com.course.request;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String courseName;
	private String bookName;
	private Double bookPrice;

}
