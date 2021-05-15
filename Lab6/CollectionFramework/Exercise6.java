package com.capg.Lab6.CollectionFramework;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise6 {

	public static void main(String[] args) throws ParseException {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(101,"2007/02/09");
		map1.put(102,"2005/03/15");
		map1.put(103,"1992/07/05");
		map1.put(104,"2000/07/17");
		map1.put(105,"1999/02/21");
		
        ArrayList<Integer> eligiblelst = votersList(map1);
        
        System.out.println(eligiblelst);
	}

	
	static ArrayList<Integer> votersList(Map<Integer,String> m1) throws ParseException
	{   ArrayList<Integer> eligiblelist = new ArrayList<Integer>();
		for(Map.Entry<Integer,String> entry: m1.entrySet())
		{   
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			
			LocalDate dob = LocalDate.parse(entry.getValue(),formatter);
			Period period = Period.between(dob, LocalDate.now());
		//	System.out.println(period.getYears());
			if(period.getYears() >= 18)
				eligiblelist.add(entry.getKey());
		}
		
		return eligiblelist;
	}
}
