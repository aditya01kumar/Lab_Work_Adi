package com.capg.Lab9.StreamAPI;

import java.util.function.BiFunction;

public class Exercise1 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			BiFunction<Integer,Integer,Double> fun= (x,y)-> Math.pow(x,y);
			double res= fun.apply(2,4);
			System.out.println(res);
		}

	}

	


