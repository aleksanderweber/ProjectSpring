package com.github.aleksanderweber.demo.model.repositories;

import com.github.aleksanderweber.demo.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
