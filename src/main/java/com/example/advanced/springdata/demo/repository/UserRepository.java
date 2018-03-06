package com.example.advanced.springdata.demo.repository;

import com.example.advanced.springdata.demo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, AdvancedRepository<User, Long> {

}
