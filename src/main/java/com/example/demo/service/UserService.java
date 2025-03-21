package com.example.demo.service;

import com.example.demo.model.MyUserDetails;
import com.example.demo.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private Repo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return new MyUserDetails(repo.getUser(username));
    }
}
