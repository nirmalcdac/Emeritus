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
    public AppUser getUserById(long id) {
        return appUserRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + id));
    }

    @Override
    public AppUser updateUser(long id, AppUser appUserDetails) {
        AppUser updateAppUser = appUserRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + id));
        updateAppUser.setUserName(appUserDetails.getUserName());
        updateAppUser.setUserPassword(appUserDetails.getUserPassword());
        updateAppUser.setCreatedBy(appUserDetails.getCreatedBy());
        updateAppUser.setUpdatedBy(appUserDetails.getUpdatedBy());
        updateAppUser.setIsActive(appUserDetails.getIsActive());
        appUserRepository.save(updateAppUser);
        return updateAppUser;
    }

    @Override
    public void deleteUser(long id) {
        AppUser deleteAppUser = appUserRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("App User not found for given id" + id));
        appUserRepository.delete(deleteAppUser);
    }
}