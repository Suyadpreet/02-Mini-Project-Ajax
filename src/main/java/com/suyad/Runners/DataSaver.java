package com.suyad.Runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.suyad.Entities.Citys;
import com.suyad.Entities.Countrys;
import com.suyad.Entities.States;

import com.suyad.Repo.CountryRepository;


@Component
public class DataSaver implements ApplicationRunner
{
	@Autowired
	CountryRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("Runner is Working Successfully..................");
		Countrys india = new Countrys();
		india.setCountryname("India");
		
		States punjab = new States();
		punjab.setStatename("Punjab");
		
		States haryana = new States();
		haryana.setStatename("Haryana");
				
		States up = new States();
		up.setStatename("Uttar Pardesh");
				
		States bihar = new States();
		bihar.setStatename("Bihar");
		
		//----------Punjab Cities Started----------------
		Citys mohali = new Citys();
		mohali.setCityname("Mohali");
		mohali.setStat(punjab);
		
		Citys ludhiana = new Citys();
		ludhiana.setCityname("Ludhiana");
		ludhiana.setStat(punjab);
		
		Citys bathinda = new Citys();
		bathinda.setCityname("Bathinda");
		bathinda.setStat(punjab);
		
		Citys moga = new Citys();
		moga.setCityname("Mohali");
		moga.setStat(punjab);
		List<Citys> punjab_cities = List.of(mohali, ludhiana, bathinda, moga);
		//----------------Punjab Cities Ended-----------------
		//----------------Haryana Cities Started--------------
		Citys ambala = new Citys();
		ambala.setCityname("Ambala");
		ambala.setStat(haryana);
		
		Citys karnal = new Citys();
		karnal.setCityname("Karnal");
		karnal.setStat(haryana);
		
		Citys panipat = new Citys();
		panipat.setCityname("Panipat");
		panipat.setStat(haryana);
		
		Citys sonipat = new Citys();
		sonipat.setCityname("Sonipat");
		sonipat.setStat(haryana);
		
		List<Citys> haryana_cities = List.of(ambala, karnal, panipat, sonipat);
		//---------------Haryana Cities Ended-----------------
		//---------------UP cities Started--------------------
		Citys noida = new Citys();
		noida.setCityname("Noida");
		noida.setStat(up);
		
		Citys greaternoida = new Citys();
		greaternoida.setCityname("Greater Noida");
		greaternoida.setStat(up);
		
		Citys mehrut = new Citys();
		mehrut.setCityname("Mehrut");
		mehrut.setStat(up);
		
		Citys kanpur = new Citys();
		kanpur.setCityname("Kanpur");
		kanpur.setStat(up);
		
		List<Citys> up_cities = List.of(noida, greaternoida, mehrut, kanpur);
		//---------------UP cities Ended--------------------
		//---------------Bihar cities Started--------------------
		Citys patna = new Citys();
		patna.setCityname("Patna");
		patna.setStat(bihar);
		
		Citys gaya = new Citys();
		gaya.setCityname("Gaya");
		gaya.setStat(bihar);
		
		Citys muzaffarpur = new Citys();
		muzaffarpur.setCityname("Muzaffarpur");
		muzaffarpur.setStat(bihar);
		
		Citys sasaram = new Citys();
		sasaram.setCityname("Sasaram");
		sasaram.setStat(bihar);
		
		List<Citys> bihar_cities = List.of(patna,gaya,muzaffarpur,sasaram);
		//---------------Bihar cities Ended--------------------
		
		punjab.setCity(punjab_cities);
		haryana.setCity(haryana_cities);
		up.setCity(up_cities);
		bihar.setCity(bihar_cities);
		
		punjab.setCnty(india);
		haryana.setCnty(india);
		up.setCnty(india);
		bihar.setCnty(india);
		
		List<States> indiaStates = new ArrayList();
		indiaStates.add(punjab);
		indiaStates.add(haryana);
		indiaStates.add(up);
		indiaStates.add(bihar);
		
		india.setState(indiaStates);
		//-----------------END OF INDIA-------------------------
		//----------------------USA-----------------------------
		Countrys US = new Countrys();
		US.setCountryname("USA");
		
		States california = new States();
		california.setStatename("California");
		
		
		States alaska = new States();
		alaska.setStatename("Alaska");
		
		
		States ohio = new States();
		ohio.setStatename("Ohio");
		
		
		States texas = new States();
		texas.setStatename("Texas");
		
		//---------------Start of California cities-----------------
		Citys losangles = new Citys();
		losangles.setCityname("Los Angles");
		losangles.setStat(california);
		
		Citys sanjose = new Citys();
		sanjose.setCityname("San Jose");
		sanjose.setStat(california);
		
		Citys oakland = new Citys();
		oakland.setCityname("Oakland");
		oakland.setStat(california);
		
		Citys sanfrancisco = new Citys();
		sanfrancisco.setCityname("San Francisco");
		sanfrancisco.setStat(california);
		List<Citys> california_cities = List.of(losangles,sanjose,oakland,sanfrancisco);
		//---------------End of California cities-----------------
		
		//---------------Start of Alaska cities-----------------
		Citys adak = new Citys();
		adak.setCityname("Adak");
		adak.setStat(alaska);
		
		Citys akhiok = new Citys();
		akhiok.setCityname("Akhiok");
		akhiok.setStat(alaska);
		
		Citys allakaket = new Citys();
		allakaket.setCityname("Allakaket");
		allakaket.setStat(alaska);
		
		Citys ambler = new Citys();
		ambler.setCityname("Ambler");
		ambler.setStat(alaska);
		List<Citys> alaska_cities = List.of(adak,akhiok,allakaket,ambler);
		//---------------End of Alaska cities-----------------
		
		//---------------Start of Ohio cities-----------------
		
		Citys akron = new Citys();
		akron.setCityname("Akron");
		akron.setStat(ohio);
		
		Citys amherst = new Citys();
		amherst.setCityname("Amherst");
		amherst.setStat(ohio);
		
		Citys avon = new Citys();
		avon.setCityname("Avon");
		avon.setStat(ohio);
		
		Citys bayVillage = new Citys();
		bayVillage.setCityname("Bay Village");
		bayVillage.setStat(ohio);
		List<Citys> ohio_cities = List.of(akron,amherst,avon,bayVillage);
		//---------------End of Ohio cities-----------------
		
		//---------------Start of Texas cities-----------------
		
		Citys houston = new Citys();
		houston.setCityname("Houston");
		houston.setStat(texas);
		
		Citys austin = new Citys();
		austin.setCityname("Austin");
		austin.setStat(texas);
		
		Citys dallas = new Citys();
		dallas.setCityname("Dallas");
		dallas.setStat(texas);
		
		Citys fortWorth = new Citys();
		fortWorth.setCityname("Fort Worth");
		fortWorth.setStat(texas);
		List<Citys> texas_cities = List.of(houston,austin,dallas,fortWorth);
		//---------------End of Texas cities-----------------
		
		california.setCity(california_cities);
		alaska.setCity(alaska_cities);
		ohio.setCity(ohio_cities);
		texas.setCity(texas_cities);
		
		california.setCnty(US);
		alaska.setCnty(US);
		ohio.setCnty(US);
		texas.setCnty(US);
		
		List<States> US_States = new ArrayList();
		US_States.add(california);
		US_States.add(alaska);
		US_States.add(ohio);
		US_States.add(texas);
		
		US.setState(US_States);
		//----------------END OF USA---------------------------
		repo.saveAll(Arrays.asList(india,US));
		System.out.println("Data Saved Successfully..........");
		
		States states = repo.getCity(8);
		System.out.println("State Name = "+states.getStatename());
		List<Citys> list = states.getCity();
		for(Citys c:list)
		{
			System.out.println(c.getCityname());
		}
	}

}
