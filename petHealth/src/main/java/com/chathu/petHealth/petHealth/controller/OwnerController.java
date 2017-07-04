package com.chathu.petHealth.petHealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chathu.petHealth.petHealth.model.Owner;
import com.chathu.petHealth.petHealth.service.OwnerService;


@RestController
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping(value = "/addOwner",method=RequestMethod.GET)
	public Owner getOwner(Owner owner){
		return ownerService.save(owner);
		

	}
	
	/*@RequestMapping(value = "/addOwner", method = RequestMethod.POST)
	public String updateEvent(Owner owner) {
			
			ownerService.save(owner);
			System.out.println("Default event updated as : " + owner.getOwnerName());
			return "redirect:addOwner.html";
		
	}*/
	
}
