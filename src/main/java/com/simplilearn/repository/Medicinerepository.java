package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Medicine;

@Repository
public interface Medicinerepository extends JpaRepository<Medicine, Integer>{

}
