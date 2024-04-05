package com.course.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.course.entity.CourseName;
import com.course.repo.CourseNameRepository;


@Component
public class DataLoader  implements ApplicationRunner {

	@Autowired
	private CourseNameRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		
		//MATRIC
		
		CourseName c1=new CourseName();
		c1.setCourseName("Matric");
		c1.setBookName("PHYSICS");
		c1.setBookPrice(999.99);
		
		CourseName c2=new CourseName();
		c2.setCourseName("Matric");
		c2.setBookName("MATH");
		c2.setBookPrice(1299.99);
		
		CourseName c3=new CourseName();
		c3.setCourseName("Matric");
		c3.setBookName("CHEMISTRY");
		c3.setBookPrice(1999.99);
		
		CourseName c4=new CourseName();
		c4.setCourseName("Matric");
		c4.setBookName("BIOLOGY");
		c4.setBookPrice(899.99);
		
		CourseName c5=new CourseName();
		c5.setCourseName("Matric");
		c5.setBookName("HINDI");
		c5.setBookPrice(599.99);
		
		CourseName c6=new CourseName();
		c6.setCourseName("Matric");
		c6.setBookName("ENGLISH");
		c6.setBookPrice(999.99);
		
		
		//INTERMEDIATE
		
		CourseName c7=new CourseName();
		c7.setCourseName("Intermediate");
		c7.setBookName("PHYSICS");
		c7.setBookPrice(2999.99);
		
		CourseName c8=new CourseName();
		c8.setCourseName("Intermediate");
		c8.setBookName("MATH");
		c8.setBookPrice(2299.99);
		
		CourseName c9=new CourseName();
		c9.setCourseName("Intermediate");
		c9.setBookName("CHEMISTRY");
		c9.setBookPrice(3999.99);
		
		CourseName c10=new CourseName();
		c10.setCourseName("Intermediate");
		c10.setBookName("BIOLOGY");
		c10.setBookPrice(1899.99);
		
		CourseName c11=new CourseName();
		c11.setCourseName("Intermediate");
		c11.setBookName("HINDI");
		c11.setBookPrice(699.99);
		
		CourseName c12=new CourseName();
		c12.setCourseName("Intermediate");
		c12.setBookName("ENGLISH");
		c12.setBookPrice(1199.99);
		
		
		List<CourseName> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
	}

}
