package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {
    Optional<AppUser> findByUserName(String appUserName);
    List<AppUser> findByActiveTrue();
}