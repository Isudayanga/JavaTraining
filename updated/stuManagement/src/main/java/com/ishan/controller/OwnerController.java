package com.ishan.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ishan.model.Owner;
import com.ishan.service.OwnerService;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "/addOwner",method=RequestMethod.POST)
    public Owner getOwner(@RequestBody Owner owner){
        System.out.println(owner.getName());
        return ownerService.save(owner);



    }
}
