package com.projetos.jp.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.jp.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
