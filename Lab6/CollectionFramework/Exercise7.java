package com.capg.Lab6.CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise7 {

	
	public static void main(String[] args) {
	 int arr[] = {2,4,1,5,8,7,3,9,0};
	 for(int i : arr)
	     System.out.println(i);
	 
	 List<Integer> sorted = getSorted(arr);
	 
	 System.out.println(sorted);

	}
	
	static List<Integer> getSorted(int arr[])
	{
		List<Integer> sortedlist = new ArrayList<>();
		
		for(int a:arr)
			sortedlist.add(a);
		
		Collections.sort(sortedlist);
		Collections.reverse(sortedlist);
		
		return sortedlist;
	}
}
