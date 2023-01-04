package com.service;

import com.domain.Admin;
import com.domain.Catagory;
import com.domain.User;
import com.domain.Zone;
import com.repository.AdminRepository;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AdminServiceImp implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImp(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }




    @Override
    public void insert(Admin admin) { adminRepository.insert(admin); }
    /*@Override
    public User getbyusername(String username){ return userRepository.getbyusername(username); }*/
    @Override
    public Admin getuser(Admin admin){return adminRepository.getuser(admin);}
    @Override
    public Catagory getcatagory(int id){return adminRepository.getcatagory(id);}
    @Override
    public void updatecalagory(Catagory catagory){adminRepository.updatecatagory(catagory);}

    @Override
    public Zone getzone(int id){return adminRepository.getzone(id);}
    @Override
    public void updatezone(Zone zone){adminRepository.updatezone(zone);}



}