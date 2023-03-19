package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, Integer>{

	
}
