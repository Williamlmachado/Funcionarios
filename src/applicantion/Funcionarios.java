package applicantion;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Dados dados = new Dados();
		System.out.println("Entre com os dados do Funcioário: ");
		System.out.print("Name: ");
		dados.name = sc.nextLine();
		System.out.print("Salário: ");
		dados.salario = sc.nextDouble();
		System.out.println("Imposto: ");
		dados.imposto = sc.nextInt();
		System.out.println(dados);
		System.out.println("Qual porcentagem de aumento? ");
		dados.aumento = sc.nextDouble();
		System.out.printf("Novo salário " + dados.aumentoSalario());
		
		

	}

}
