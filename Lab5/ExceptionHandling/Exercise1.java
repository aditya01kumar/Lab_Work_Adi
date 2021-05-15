package com.capg.Lab5.ExceptionHandling;
import java.util.Scanner;
@SuppressWarnings("serial")
class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  super(str);
	 }
	}
	public class Exercise1 {
	 
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter your Age ");
	  int age = s.nextInt();
	  s.close();
	  try {
	   if(age < 15) 
	    throw new AgeException("Invalid Age");
	   else
	    System.out.println("Valid Age");
	  }
	  catch (AgeException e) {
	   System.out.println(e);
	  }
	 }
	}
	