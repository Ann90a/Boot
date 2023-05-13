package com.example.pp312.springboot.dao;


import com.example.pp312.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
