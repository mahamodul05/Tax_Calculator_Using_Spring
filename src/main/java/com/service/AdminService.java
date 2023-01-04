package com.service;

import com.domain.Admin;
import com.domain.Catagory;
import com.domain.User;
import com.domain.Zone;

public interface AdminService {

    public void insert(Admin admin);
    /*public Admin getbyusername(String useranme);*/
    public Admin getuser(Admin admin);
    public Catagory getcatagory(int id);
    public void updatecalagory(Catagory catagory);

    public Zone getzone(int id);
    public void updatezone(Zone zone);

}
