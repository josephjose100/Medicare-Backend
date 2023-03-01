package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, Integer>{

}
