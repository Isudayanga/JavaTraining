package com.ishan.service;

import com.ishan.model.Owner;
import com.ishan.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by isudayanga on 7/4/2017.
 */
@Service("ownerService")
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    OwnerRepository ownerRepository;

    public Owner save(Owner owner) {

        return ownerRepository.save(owner);
    }


}
