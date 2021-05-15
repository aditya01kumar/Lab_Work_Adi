package com.capg.Lab7.LayeredArchitecture;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	valid(age);
	
	sc.close();
		

	}
	static void valid(int age) {
		 try {
			 if(age<15) {
				 AgeLimitException e=new AgeLimitException();
				 throw e;
			 }
			 else {
				 System.out.println("age is valid");
			 }
		 }catch(AgeLimitException e){
			 System.out.println(e.toString());
		 }
	 }
	

}


class AgeLimitException extends Exception{
	private static final long serialVersionUID = 1L;

	public String toString() {
  	  return "age is not valid";
    }
	
}