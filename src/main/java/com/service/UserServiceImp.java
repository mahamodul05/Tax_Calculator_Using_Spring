package com.service;

import com.domain.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImp implements UserService {



    private UserRepository userRepository;

    private PasswordEncoder encoder;


    public UserServiceImp(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }




    @Override
    public void insert(User user) { userRepository.insert(user); }
    @Override
    public User getbyusername(String username){ return userRepository.getbyusername(username); }
    @Override
    public User getuser(User user){return userRepository.getuser(user);}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getbyusername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getAuthorities());
    }





}