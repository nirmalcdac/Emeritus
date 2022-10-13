package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> getAllUsers();

    AppUser createUser(AppUser appUser);

    AppUser getUserById(long id);

    AppUser updateUser(long id, AppUser appUserDetails);

    void deleteUser(long id);
}