package com.main;
import java.util.ArrayList;

import com.obj.Student;

public class App {
	
	static int nav;
	static int nav1;

	public static void main(String[] args) {
		
		Student listaAlunos = new <ArrayList> Student();
			
		nav = 1;
		nav1=1;
		
		while(true) {
			
			System.out.println("Welcome to Guitar School \n" + 
			"Choose one  option bellow: \n" +
			"1- Students\n" +
			"2- Finance\n" +
			"3- Classes");
			
			if(nav == 1) {
				
				System.out.println("Chose one option bellow: \n" +
				"1- Add a Student\n" +
				"2- Remove a Student\n" +
				"3- List all Students");
				
				switch(nav1) {
				
				case 1:
					System.out.println("Adding a Student, Please submit the info: ");
					
					listaAlunos.addStudent("Felipe", "11930855742", "Guitar");;
					
					nav=3;
					break;
				case 2:
					System.out.println("Removing a student, Please submit the Id");
					
					break;
					
				
				case 3:
					System.out.println("Students List:");
					
					System.out.println(listaAlunos);
					
					break;
					
				default:
					System.out.println("You did something wrong, please verify the number");
					
			}
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
	}
		
}

	

}