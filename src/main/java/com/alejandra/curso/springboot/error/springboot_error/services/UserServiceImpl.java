package com.alejandra.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alejandra.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Alejandra", "Gonzalexx"));    
        users.add(new User(2L, "Josefa", "Perez"));
        users.add(new User(3L, "Pepa", "Agudelo"));
        users.add(new User(4L, "Maria", "Pepa"));
        users.add(new User(5L, "Yami", "Varela"));
    }


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        
        return Optional.ofNullable(user);
    }

}
