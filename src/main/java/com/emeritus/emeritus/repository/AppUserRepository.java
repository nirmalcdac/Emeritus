package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    Optional<AppUser> findByUserName(String appUserName);
}