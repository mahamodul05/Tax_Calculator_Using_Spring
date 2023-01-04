package com.repository;

import com.domain.User;

public interface UserRepository {

    public void insert(User user);
    public User getbyusername(String useranme);
    public User getuser(User user);

}
