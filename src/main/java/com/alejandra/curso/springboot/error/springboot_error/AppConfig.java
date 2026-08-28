package com.alejandra.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alejandra.curso.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> UserServiceImpl() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Alejandra", "Gonzalexx"));    
        users.add(new User(2L, "Josefa", "Perez"));
        users.add(new User(3L, "Pepa", "Agudelo"));
        users.add(new User(4L, "Maria", "Pepa"));
        users.add(new User(5L, "Yami", "Varela"));
        
        return users;
    }
}
