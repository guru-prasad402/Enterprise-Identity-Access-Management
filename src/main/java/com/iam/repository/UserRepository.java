package com.iam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iam.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}