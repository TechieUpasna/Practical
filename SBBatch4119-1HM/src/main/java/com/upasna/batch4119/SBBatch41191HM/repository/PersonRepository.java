package com.upasna.batch4119.SBBatch41191HM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upasna.batch4119.SBBatch41191HM.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{ 

}
