package com.ishan.repository;

import com.ishan.model.Owner;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by isudayanga on 7/4/2017.
 */
@Repository("ownerRepository")
@Transactional
public class OwnerRepositoryImpl implements OwnerRepository{

    @PersistenceContext
    EntityManager entityManager;

    public Owner save(Owner owner) {
        System.out.println(owner.getName()+"================================");
        if(owner.getId()==0){
            entityManager.persist(owner);
        }else{
            owner = entityManager.merge(owner);
        }
        entityManager.flush();

        return owner;
    }


}
