package com.ishan.repository;

import com.ishan.model.Owner;
import org.springframework.stereotype.Repository;

/**
 * Created by isudayanga on 7/4/2017.
 */
@Repository("ownerRepository")
public class OwnerRepositoryImpl implements OwnerRepository{

    public Owner save(Owner owner) {
     owner.setId(1);
     owner.setCity("Athurugiriya");
     owner.setMobile("07777777");
     owner.setName("ishan");


        return owner;
    }


}
