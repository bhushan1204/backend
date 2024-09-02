package com.Technosignia.azown.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Technosignia.azown.entity.Owner;
import com.Technosignia.azown.repository.OwnerRepository;
@Service
public class OwnerService {
 @Autowired
 OwnerRepository ownerRepository;

	public Owner  createOwnerDetails(Owner owner) {
		return ownerRepository.save(owner);
		
	}

	public Owner updateOwnerDetails(Owner owner,  Long id) {
		System.out.println(owner);
		System.out.println(id);
		Optional<Owner> optionalowner=ownerRepository.findById(id);
		Owner dbowner=null;
		if(optionalowner.isPresent()) {
			dbowner=optionalowner.get();
			if(owner.getName()!=null)
			dbowner.setName(owner.getName());
			if(owner.getContact()!=null)
			dbowner.setContact(owner.getContact());
			if(owner.getEmail()!=null)
			dbowner.setEmail(owner.getEmail());
			if(owner.getAddress()!=null)
			dbowner.setAddress(owner.getAddress());
			if(owner.getProperties()!=null)
			dbowner.setProperties(owner.getProperties());
			
			ownerRepository.save(dbowner);
			
		}
		return dbowner;
		
		
	}
	public List<Owner> findAllOwnerDetails() {
		
		return ownerRepository.findAll();
		
	}

	public Owner findOwnerDetailsById(Long id) {
		
		return ownerRepository.findById(id).get();
	}

	public String deleteOwnerDetailsById(Long id) {
		
		 ownerRepository.deleteById(id);
		 return "record deleted successfully";
	}
}
