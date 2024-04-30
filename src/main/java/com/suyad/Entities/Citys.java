package com.suyad.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Citys 
{
	@Id
	@Column(name = "City_Id")
	@GeneratedValue
	private Integer CityId;
	private String Cityname;
	@ManyToOne
	@JoinColumn(name = "State_Id",referencedColumnName = "State_Id")
	private States stat;
}
