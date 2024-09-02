package com.Technosignia.azown.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.azown.entity.Owner;
import com.Technosignia.azown.service.OwnerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin(origins = "https://heroic-scone-ff8a61.netlify.app")
@RestController
public class OwnerController {
  
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner")
	public Owner createOwnerDetails(@RequestBody Owner owner) {
	
		
		return ownerService.createOwnerDetails(owner);
	}
	@PutMapping("/owner")
	public Owner updateOwnerDetails( @RequestBody Owner owner ,@RequestParam Long id) {
	
		
		return ownerService.updateOwnerDetails(owner,id);
	}
	
	@GetMapping("/owner")
	public List<Owner> findAllProperties() {
		
		return ownerService.findAllOwnerDetails();
		
	}
	
	@DeleteMapping("/owner/{id}")
	public String deleteOwnerDetailsById(@PathVariable Long id){
	return ownerService.deleteOwnerDetailsById(id);
	}
	
	@GetMapping("/owner/id/{id}")
	public Owner findOwnerDetailsById(@PathVariable Long id) {
		 return ownerService.findOwnerDetailsById(id);
	}
	
	
	}
	
	
	

