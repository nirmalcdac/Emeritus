package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}