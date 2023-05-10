package com.upasna.pringBootBatch4119.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upasna.pringBootBatch4119.model.BookManagement;

@Repository
public interface BookManagementRepository extends JpaRepository<BookManagement,Long> {
	

}
