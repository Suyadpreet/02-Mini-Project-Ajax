package com.suyad.Entities;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class Countrys
{
	@Id
	@Column(name = "Country_Id")
	@GeneratedValue
	private Integer CountryId;
	private String countryname;
	@OneToMany(mappedBy = "cnty",fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval=true)
	private List<States> state;
	
}
