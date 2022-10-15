package com.emeritus.emeritus.security;

import com.emeritus.emeritus.repository.AppUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = AppUserRepository.class)
public class SpringSecurityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaApplication.class, args);
    }

}
