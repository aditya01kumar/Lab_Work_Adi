package com.capg.Lab9.StreamAPI;

import java.util.function.BiFunction;


class Employee{
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	//public Employee(String fname, String lname) {
		//super();
		//this.fname = fname;
		//this.lname = lname;
	//}
	public String FullName(String fname,String lname) {
		return (fname.concat(lname));
	}
	
}
public class Exercise4 {

	public static void main(String[] args) {
		BiFunction<String,String,String> fun= new Employee()::FullName;
		String fullname=fun.apply("Aditya", " Kumar");
		System.out.println(fullname);
	}

}




