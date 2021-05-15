package com.capg.Lab9.StreamAPI;

import java.util.function.Consumer;

public class Exercise2 {

	public static void main(String[] args) {
		Consumer<String> fun= str-> System.out.println(str.replace("", " ").trim());
		fun.accept("   Aditya  ");

	}

}

