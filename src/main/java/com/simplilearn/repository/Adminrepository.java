package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Admin;
@Repository
public interface Adminrepository extends JpaRepository<Admin, Integer>{

}
