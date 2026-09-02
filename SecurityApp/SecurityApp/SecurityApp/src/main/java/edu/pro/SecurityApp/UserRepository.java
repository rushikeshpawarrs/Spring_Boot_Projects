package edu.pro.SecurityApp;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, String> {
	
	Optional<AppUser> findByUsername(String name);
}
