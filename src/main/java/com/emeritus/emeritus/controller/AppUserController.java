package com.emeritus.emeritus.controller;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {
    @Autowired
    private final AppUserServiceImpl appUserService;

    public AppUserController(AppUserServiceImpl appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/appUser")
    public List<AppUser> getAllUsers() {
        return appUserService.getAllUsers();
    }

    @PostMapping("/appUser")
    public AppUser createUser(@RequestBody AppUser appUser) {
        return appUserService.createUser(appUser);
    }

    @GetMapping("/appUser/{id}")
    public ResponseEntity<AppUser> getUserById(@PathVariable long id) {
        AppUser appUser = appUserService.getUserById(id);
        return ResponseEntity.ok(appUser);
    }

    @PutMapping("/appUser/{id}")
    public ResponseEntity<AppUser> updateUser(@PathVariable long id, @RequestBody AppUser appUserDetails) {
        AppUser appUser = appUserService.updateUser(id, appUserDetails);
        return ResponseEntity.ok(appUser);
    }

    @DeleteMapping("/appUser/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id) {
        appUserService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}