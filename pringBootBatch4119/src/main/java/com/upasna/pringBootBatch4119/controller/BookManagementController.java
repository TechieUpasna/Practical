package com.upasna.pringBootBatch4119.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upasna.pringBootBatch4119.model.BookManagement;
import com.upasna.pringBootBatch4119.repository.BookManagementRepository;

@RestController
@RequestMapping("/book")
public class BookManagementController {
	@Autowired
	BookManagementRepository bmr;
	@PostMapping("/save")
	public void saveBook(@RequestBody BookManagement book) {
		bmr.save(book);
	}
	@RequestMapping("/details")
	public List<BookManagement> getBooks(){
		return bmr.findAll();
	}
	@RequestMapping("/update/{id}/{bookName}")
	public void updateBook(@PathVariable("id")Long id,@PathVariable("bookName")String name, String bname) {
		BookManagement bmt=bmr.findById(id).get();
		bmt.setBookName(bname);
		bmr.save(bmt);
	}
	@RequestMapping("/delete")
	public void deleteBook(@PathVariable("id")Long id) {
			bmr.deleteById(id);
			}

	}
	
