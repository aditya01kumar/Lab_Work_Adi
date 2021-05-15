package com.capg.Lab6.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String args[])
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int secSmall = getSecondSmallest(arr);
		
		System.out.println(secSmall);
	}
	
	static int getSecondSmallest(int[] arr)
	{
		List<Integer> arrlist = new ArrayList<Integer>();
		
		for(int a : arr)
			arrlist.add(a);
		
		Collections.sort(arrlist);
		
		
		return arrlist.get(1);
	}
}
