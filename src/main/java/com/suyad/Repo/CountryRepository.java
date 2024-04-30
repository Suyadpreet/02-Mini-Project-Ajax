package com.suyad.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suyad.Entities.Countrys;
import com.suyad.Entities.States;

import jakarta.transaction.Transactional;

@Repository
public interface CountryRepository extends JpaRepository<Countrys, Integer> 
{
	@Transactional
	@Query(value="from States where StateId = :stateId")
	public States getCity(Integer stateId);
	
	@Transactional
	@Query(value="from Countrys where CountryId = :countryId")
	public Countrys getStates(Integer countryId);
}
