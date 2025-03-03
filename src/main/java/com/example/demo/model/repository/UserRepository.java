package com.example.demo.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
