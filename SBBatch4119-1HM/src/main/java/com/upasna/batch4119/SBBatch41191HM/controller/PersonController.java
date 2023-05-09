package com.upasna.batch4119.SBBatch41191HM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upasna.batch4119.SBBatch41191HM.model.Person;
import com.upasna.batch4119.SBBatch41191HM.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonRepository pr;
	@RequestMapping("/details")
	public List<Person> getPersonDetails(){
		return pr.findAll();
	}
	@RequestMapping("/details/{id}")
	public Person getByPersonId(@PathVariable("id")long id) {
		return pr.findById(id).get();
	}
	@RequestMapping("/details/update/{id}/{name}")
	public String UpdatePerson(@PathVariable("id")long id,@PathVariable("name")String name) {
		Person p1=pr.findById(id).get();
		p1.setName(name);
		pr.save(p1);
		return "Updated"+id+" with"+name;
	}
	@RequestMapping("/details/delete/{id}")
	public String deletePerson(@PathVariable("id")long id) {
		pr.deleteById(id);
		return "Deleted Person with id: "+id;
	
	}
	}


