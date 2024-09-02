package com.Technosignia.azown.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.azown.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long >{
	

}
