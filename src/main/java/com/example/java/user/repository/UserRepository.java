package com.example.java.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
