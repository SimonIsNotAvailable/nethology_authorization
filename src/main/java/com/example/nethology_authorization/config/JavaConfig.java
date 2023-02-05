package com.example.nethology_authorization.config;
import com.example.nethology_authorization.controller.AuthorizationController;
import com.example.nethology_authorization.repository.UserRepository;
import com.example.nethology_authorization.service.AuthorizationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
//    @Bean
//    public AuthorizationController authController() {
//        return new AuthorizationController();
//    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
//    @Bean
//    public AuthorizationService AuthorizationService() {
//        return new AuthorizationService(UserRepository userRepository);
//    }
}
