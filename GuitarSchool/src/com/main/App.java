package com.main;

import com.obj.Students;

public class App {

	public static void main(String[] args) {
		Students aluno = new Students("Luis Botta", "(11)93085-5742", "Guitarra");
		Students aluno1 = new Students("Luis", "11-930855742", "Guitar");
		
		aluno.payClass(120.0);
		
		System.out.println("Ola " + aluno.getName() + " portador do id:" + aluno.getId());
		System.out.println("Estamos entrando em contato atraves do " + aluno.getContact());
		System.out.println("Para marcamos sua aula de: " + aluno.getInstrument());
		System.out.println("Lembrando que voce tem um saldo de R$ " + aluno.getBalance());
	}

}