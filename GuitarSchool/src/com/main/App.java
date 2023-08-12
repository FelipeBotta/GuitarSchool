package com.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.obj.Student;

public class App {
	
	static int nav;
	static int nav1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> listaAlunos = new ArrayList<>();
		
		
		while(true) {
			
			System.out.println("Welcome to Guitar School \n" + 
			"Choose one  option bellow: \n" +
			"1- Students\n" +
			"2- Finance\n" +
			"3- Classes");
			
			int nav = sc.nextInt();
			
			if(nav == 0) {
				System.out.println("Exiting the application.");
				break;
			}else if(nav == 1) {
				handleStudentMenu(sc, listaAlunos);
			}else if(nav == 2) {
				//handle finance
			}else if(nav == 3) {
				//handle classes
			}else {
				System.out.println("Invalid option.");
			}
			sc.close();}
		}
		
		private static void handleStudentMenu(Scanner sc, List<Student> listaAlunos) {
			
			while(true) {

				System.out.println("Chose one option bellow: \n" +
				"1- Add a Student\n" +
				"2- Remove a Student\n" +
				"3- List all Students\n"+
				"0- Back to Main Menu");
				
				int nav1 = sc.nextInt();
				
				switch(nav1) {
				case 1:
					System.out.println("Adding a Student, Please submit the info: ");
					String name = sc.next();
					String contact = sc.next();
					String instrument = sc.next();
					Student aluno = new Student();
					listaAlunos.add(aluno);
					System.out.println("Student added successfully");
					break;
				
				case 2:
					System.out.println("Removing a student, Please submit the Id");
					
					break;
					
				
				case 3:
					System.out.println("Students List:");
					
					for(Student aluno1 : listaAlunos) {
						System.out.println(aluno1);
					}
					break;
					
				case 0:
					return;
					
				default:
					System.out.println("You did something wrong, please verify the number");
					
			}			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}