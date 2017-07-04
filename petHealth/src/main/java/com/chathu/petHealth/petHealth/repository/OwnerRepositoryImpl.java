package com.chathu.petHealth.petHealth.repository;


import org.springframework.stereotype.Repository;
import com.chathu.petHealth.petHealth.model.Owner;

@Repository("ownerRepository")
public class OwnerRepositoryImpl implements OwnerRepository{
	

	public Owner save(Owner owner) {
		
		owner.setId(1);
		owner.setOwnerAddress("Malambe");
		owner.setOwnerMobile("0713623596");
		owner.setOwnerName("Chathushka");
		owner.setOwnerNIC("927901234V");
		
		return owner;
	}

}
