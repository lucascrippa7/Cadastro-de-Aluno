package Cadastro;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ClassesAluno.Alunos;

public class Cadastro {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Quantos alunos você deseja cadastrar?");
			int n = sc.nextInt();
			
			List <Alunos> list = new ArrayList<>();
		
		
	
			
			for(int i = 1; i<=n;i++) {
			
			System.out.println("Digite o nome do aluno " + i);
			String nome = sc.next();
			System.out.println("Digite a idade do aluno " + i);
			int idade = sc.nextInt();
			System.out.println("Digite o sexo do aluno " + i);
			String sexo = sc.next();
			System.out.println("Digite o CPF do aluno " + i);
			String cpf = sc.next();
			System.out.println();
			
			Alunos alun = new Alunos(nome, idade, sexo, cpf);
			list.add(alun);
			
			}
			
			for(Alunos alun : list) {
			System.out.println("Nome: " + alun.getNome());
			System.out.println("CPF: " + alun.getCPF());
			System.out.println("Idade: " + alun.getIdade());
			System.out.println("Sexo: " + alun.getSexo());
			}
		}

	

}
