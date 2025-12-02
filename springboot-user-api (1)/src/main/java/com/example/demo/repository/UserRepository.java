package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCountryNotOrderByAgeAsc(Country country);
}