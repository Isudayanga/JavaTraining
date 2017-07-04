package com.ishan.controller;

import com.ishan.model.Owner;
import com.ishan.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isudayanga on 7/4/2017.
 */
@RestController
public class OwnerController {


 @Autowired
    OwnerService ownerService;

    @RequestMapping(value = "/addOwner",method=RequestMethod.GET)
    public Owner getOwner(Owner owner){
        return ownerService.save(owner);



    }
}
