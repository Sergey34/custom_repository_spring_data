package com.example.advanced.springdata.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class AdvancedRepositoryImpl<T, ID> implements AdvancedRepository<T, ID> {

    @Autowired
    EntityManager em;

    @Override
    public List<T> getByPass(String query) {
        return em.createQuery("select * from User").getResultList();
    }


    @PostConstruct
    public void init() {
        System.out.println("###");
    }
}
