package com.capg.Lab5.ExceptionHandling;
import java.util.Scanner;
@SuppressWarnings("serial")
class exception extends Exception{
	public exception(String s){
		 System.out.println(s);
	 }
 }
public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER FIRST NAME");
		String a=obj.next();
		System.out.println("ENTER LAST NAME");
		String b=obj.next();
		obj.close();

	try {
		if(a==null)
			throw  new exception(" PLEASE ENTER YOUR FIRST NAME");
		if(b==null)
			throw  new exception(" PLEASE ENTER YOUR SECOND NAME");
		else
		System.out.println("Name Entered");
	}
	catch(exception a1) {
		System.out.println(a1.getMessage());
	}
	finally {
		obj.close();
	}
	
}

}

