package com.repository;

import com.domain.Admin;
import com.domain.Catagory;
import com.domain.User;
import com.domain.Zone;

public interface AdminRepository {

    public void insert(Admin admin);
    /*public User getbyusername(String useranme);*/
    public Admin getuser(Admin admin);
    public Catagory getcatagory(int id);
    public void updatecatagory(Catagory catagory);
    public Zone getzone(int id);
    public void updatezone(Zone zone);

}
