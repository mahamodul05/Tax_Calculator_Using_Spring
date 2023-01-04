package com.repository;

import com.domain.Admin;
import com.domain.Catagory;
import com.domain.User;
import com.domain.Zone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Transactional
@Repository
public class AdminRepositoryImp implements AdminRepository {

    private final SessionFactory sessionFactory;
    public AdminRepositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insert(Admin admin){
        Session session = sessionFactory.getCurrentSession();
        session.save(admin);
    }
    /*@Override
    public User getbyusername(String username){
        Session session = sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("from User where username like '%" + username + "%'", User.class);
        return userQuery.getSingleResult();
    }*/


    @Override
    public Admin getuser(Admin admin) {

        Session session = this.sessionFactory.getCurrentSession();
        try {
            Query<Admin> query = session.createQuery("from Admin where username =:username and password =:password", Admin.class);
            query.setParameter("username", admin.getUsername());
            query.setParameter("password", admin.getPassword());

            admin = query.getSingleResult();
            return admin;
        }catch (NoResultException e) {
            // TODO: handle exception
            return null;
        }
    }


    @Override
    public Catagory getcatagory(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Catagory.class, id);
    }
    @Override
    public void updatecatagory(Catagory catagory){
        Session session = sessionFactory.getCurrentSession();
        session.update(catagory);
    }
    @Override
    public Zone getzone(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Zone.class, id);
    }
    @Override
    public void updatezone(Zone zone){
        Session session = sessionFactory.getCurrentSession();
        session.update(zone);
    }





}