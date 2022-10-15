package com.emeritus.emeritus.service;

import com.emeritus.emeritus.exception.ResourceNotFoundException;
import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Autowired
    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser getUserById(String user_id) {
        return appUserRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + user_id));
    }

    @Override
    public AppUser updateUser(String user_id, AppUser appUserDetails) {
        AppUser updateAppUser = appUserRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + user_id));
        updateAppUser.setAppUserPassword(appUserDetails.getAppUserPassword());
        updateAppUser.setAppUserRole(appUserDetails.getAppUserRole());
        updateAppUser.setCreatedBy(appUserDetails.getCreatedBy());
        updateAppUser.setUpdatedBy(appUserDetails.getUpdatedBy());
        updateAppUser.setCreatedAt(appUserDetails.getCreatedAt());
        updateAppUser.setUpdatedAt(appUserDetails.getUpdatedAt());
        updateAppUser.setIsActive(appUserDetails.getIsActive());
        appUserRepository.save(updateAppUser);
        return updateAppUser;
    }

    @Override
    public void deleteUser(String user_id) {
        AppUser deleteAppUser = appUserRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + user_id));
        appUserRepository.delete(deleteAppUser);
    }
}