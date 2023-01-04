package com.repository;

import com.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Transactional
@Repository
public class UserRepositoryImp implements UserRepository {

    private final SessionFactory sessionFactory;
    public UserRepositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insert(User user){
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
    @Override
    public User getbyusername(String username){
        Session session = sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("from User where username like '%" + username + "%'", User.class);
        return userQuery.getSingleResult();
    }
    /*@Transactional
    @Override
    public User getuser(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("from User where username like '%" + username + "%'", User.class);
        return userQuery.getSingleResult();
    }*/

    @Override
    public User getuser(User user) {

        Session session = this.sessionFactory.getCurrentSession();
        try {
            Query<User> query = session.createQuery("from User where username =:username and password =:password", User.class);
            query.setParameter("username", user.getUsername());
            query.setParameter("password", user.getPassword());

            user = query.getSingleResult();
            return user;
        }catch (NoResultException e) {
            // TODO: handle exception
            return null;
        }
    }



}