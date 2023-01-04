package com.repository;

import com.domain.Taxhistory;
import com.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Transactional
@Repository
public class TaxRepositoryImp implements TaxRepository {

    private final SessionFactory sessionFactory;
    public TaxRepositoryImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Taxhistory gettaxhistory(Taxhistory taxhistory) {

        Session session = this.sessionFactory.getCurrentSession();
        try {
            Query<Taxhistory> query = session.createQuery("from Taxhistory where username =:username", Taxhistory.class);
            query.setParameter("username", taxhistory.getUsername());

            taxhistory = query.getSingleResult();
            return taxhistory;
        }catch (NoResultException e) {
            // TODO: handle exception
            return null;
        }
    }



}