package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> getAllUsers();

    AppUser createUser(AppUser appUser);

    AppUser getUserById(String userId);

    AppUser updateUser(String userId, AppUser appUserDetails);

    void deleteUser(String userId);
}