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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class States
{
	@Id
	@Column(name = "State_Id")
	@GeneratedValue
	private Integer StateId;
	private String statename;
	@OneToMany(mappedBy = "stat",fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval=true)
	private List<Citys> city;
	
	@ManyToOne
	@JoinColumn(name = "Country_Id",referencedColumnName = "Country_Id")
	private Countrys cnty;
}
