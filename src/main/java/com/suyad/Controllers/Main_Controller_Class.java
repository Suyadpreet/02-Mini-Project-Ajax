package com.suyad.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Main_Controller_Class 
{
	@Autowired
	Gson json;
	@GetMapping("/")
	public String indexpage(Model model)
	{
		model.addAttribute("msg", "Hello Suyadpreet Singh");
		return "index";
	}
	@GetMapping("/idx")
	//ResponseEntity<String> Ajaxprocessingpage(@RequestParam("names") String name)
	public @ResponseBody String Ajaxprocessingpage(@RequestParam("names") String name)
	{
		
		if(name!=null && !"".equals(name))
		{
			name = "Hello "+name;
		}
		return name;
		//return new ResponseEntity<>(name, HttpStatus.OK);
	}
	@GetMapping("/wel")
	public String welcomepage(Model model)
	{
		model.addAttribute("msg", "Hello Suyadpreet Singh");
		return "welcome";
	}
	@GetMapping("/county")
	//ResponseEntity<String> Ajax_processing_Country_page()
	public @ResponseBody String Ajax_processing_Country_page()
	{
		List<String> asList = Arrays.asList("India","USA","Canada","UK");
		Map<Integer,String> countryMap = new HashMap();
		int count = 1;
		for(String s:asList)
		{
			countryMap.put(count, s);
			count++;
		}
		Set<Integer> keySet = countryMap.keySet();
		java.util.Iterator<Integer> it = keySet.iterator();
		while(it.hasNext())
		{
			Integer next = it.next();
			System.out.println(next+" : "+countryMap.get(next));
		}
		String CountriesString = json.toJson(countryMap);
		System.out.println(CountriesString);
		//return new ResponseEntity<>(CountriesString, HttpStatus.OK);
		return CountriesString;
	}
	
	@GetMapping("/states")
	//ResponseEntity<String> Ajax_processing_State_page(@RequestParam("countryId")String countryid)
	public @ResponseBody String Ajax_processing_State_page(@RequestParam("countryId")String countryid)
	{
		int count = 1;
		System.out.println(countryid);
		String StatesString = null;
		if(countryid.equals("1"))
		{
			List<String> asList = Arrays.asList("Punjab","Haryana","Uttar Pardesh","Bihar");
			Map<Integer,String> stateMap = new HashMap();
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			StatesString = json.toJson(stateMap);
		}
		if(countryid.equals("2"))
		{
			List<String> asList = Arrays.asList("California","Alaska","Ohio","Texas");
			Map<Integer,String> stateMap = new HashMap();
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			StatesString = json.toJson(stateMap);
		}
		if(countryid.equals("3"))
		{
			List<String> asList = Arrays.asList("Ontario","Quebec","British Columbia","Alberta");
			Map<Integer,String> stateMap = new HashMap();
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			StatesString = json.toJson(stateMap);
		}
		if(countryid.equals("4"))
		{
			List<String> asList = Arrays.asList("North East","Notrh West","South East","South West");
			Map<Integer,String> stateMap = new HashMap();
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			StatesString = json.toJson(stateMap);
		}
		System.out.println(StatesString);
		//return new ResponseEntity<>(StatesString, HttpStatus.OK);
		return StatesString;
	}
	
	@GetMapping("/cities")
	//ResponseEntity<String> Ajax_processing_City_page(@RequestParam("stateId")String stateid,@RequestParam("countryId")String countryid)
	public @ResponseBody String Ajax_processing_City_page(@RequestParam("stateId")String stateid,@RequestParam("countryId")String countryid)
	{
		System.out.println(stateid);
		String CitiesString = null;
		if(stateid.equals("1") && countryid.equals("1"))
		{
			List<String> asList = Arrays.asList("Ludhiana","Mohali","Amritsar","Jalandhar");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("2") && countryid.equals("1"))
		{
			List<String> asList = Arrays.asList("Ambala","Karnal","Panipat","Sonipat");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("3") && countryid.equals("1"))
		{
			List<String> asList = Arrays.asList("Noida","Greater Noida","Mehrut","Kanpur");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("4") && countryid.equals("1"))
		{
			List<String> asList = Arrays.asList("Patna","Gaya","Muzaffarpur","Sasaram");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("1") && countryid.equals("2"))
		{
			List<String> asList = Arrays.asList("Los Angles","San Jose","Oakland","San Francisco");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("2") && countryid.equals("2"))
		{
			List<String> asList = Arrays.asList("Adak","Akhiok","Allakaket","Ambler");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("3") && countryid.equals("2"))
		{
			List<String> asList = Arrays.asList("Akron","Amherst","Avon","Bay Village");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			CitiesString = json.toJson(stateMap);
		}
		if(stateid.equals("4") && countryid.equals("2"))
		{
			List<String> asList = Arrays.asList("Houston","Austin","Dallas","Fort Worth");
			Map<Integer,String> stateMap = new HashMap();
			int count = 1;
			for(String s:asList)
			{
				stateMap.put(count, s);
				count++;
			}
			CitiesString = json.toJson(stateMap);
		}
		System.out.println(CitiesString);
		System.out.println("Country id = "+countryid);
		//return new ResponseEntity<>(CitiesString, HttpStatus.OK);
		return CitiesString;
	}
	
	@GetMapping("/validateEmail")
	public @ResponseBody String Ajax_Email_validation_page(@RequestParam("Email")String email)
	{
		List<String> list = List.of("suyadpreet@gmail.com", "kamalpreet@gmail.com");
		String lowercase_email = email.toLowerCase();
		boolean contains = list.contains(lowercase_email);
		if(contains)
		{
			return "Duplicate";
		}
		else
		{
			return "Available";
		}
	}
	@GetMapping("/register")
	public String register_Successful_Page(Model model)
	{
		model.addAttribute("msg", "You has been Registered Successfully");
		return "RegisterSuccess";
	}
	
}
