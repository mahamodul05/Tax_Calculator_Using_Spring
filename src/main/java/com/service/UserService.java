package com.service;

import com.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    public void insert(User user);
    public User getbyusername(String useranme);
    public User getuser(User user);

}
