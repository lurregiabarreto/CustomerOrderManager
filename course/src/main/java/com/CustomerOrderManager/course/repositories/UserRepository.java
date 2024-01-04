package com.CustomerOrderManager.course.repositories;

import com.CustomerOrderManager.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}