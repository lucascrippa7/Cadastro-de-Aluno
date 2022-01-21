package Cadastro;

import java.util.Locale;
import java.util.Scanner;

import ClassesAluno.Alunos;

public class Cadastro {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	
			Alunos A= new Alunos();
			
			
			System.out.println("Digite o nome do aluno A");
			A.setNome(sc.nextLine());
			System.out.println("Digite a idade do aluno A");
			A.setIdade(sc.nextInt());
			System.out.println("Digite o sexo do aluno A");
			A.setSexo(sc.next());
			System.out.println("Digite o CPF do aluno A");
			A.setCPF(sc.next());
			System.out.println();
			
			System.out.printf("%s \n", A.getNome());
			System.out.printf("%s \n", A.getCPF());
			System.out.printf("%d \n", A.getIdade());
			System.out.printf("%s \n",  A.getSexo());
		}

	

}
