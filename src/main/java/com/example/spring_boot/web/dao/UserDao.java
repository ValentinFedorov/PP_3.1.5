package com.example.spring_boot.web.dao;

import com.example.spring_boot.web.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserDao extends UserDetailsService {

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user, long id);

    List<User> getListUsers();

    User getUser(long id);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
