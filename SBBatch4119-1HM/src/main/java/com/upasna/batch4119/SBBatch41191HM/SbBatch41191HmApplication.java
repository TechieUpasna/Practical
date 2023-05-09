package com.upasna.batch4119.SBBatch41191HM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upasna.batch4119.SBBatch41191HM.repository.PersonRepository;
import com.upasna.batch4119.SBBatch41191HM.model.*;


@SpringBootApplication

public class SbBatch41191HmApplication {

	@Autowired
	PersonRepository pr;
	public static void main(String[] args) {
	SpringApplication.run(SbBatch41191HmApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	Person p1 = new Person("Aryan Srivastav","Lucknow");
	Person p2 = new Person("Ritu Gautam","Kazhiabad");
	Adhaar a1 = new Adhaar(12345);
	Adhaar a2 = new Adhaar(45678);
	p1.setAdha(a1);
	p2.setAdha(a2);
	pr.save(p1);
	pr.save(p2);
	
	

		
	}

}
