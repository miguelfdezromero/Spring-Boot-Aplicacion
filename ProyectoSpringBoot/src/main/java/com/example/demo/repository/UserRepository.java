package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);

	public User findByIdAndPassword(Long id, String password);

}
