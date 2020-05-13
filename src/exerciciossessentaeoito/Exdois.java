package exerciciossessentaeoito;

import java.util.Locale;
import java.util.Scanner;

import entities.NetSalary;

public class Exdois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String Name;
		double Tax;
		NetSalary Gross = new NetSalary();
		System.out.println("Digite seu nome: ");
		Name = sc.nextLine();
		System.out.println("Digite seu salario bruto: ");
		Gross.GrossSalary = sc.nextDouble();
		System.out.println("Digite o Imposto: ");
		Tax = sc.nextDouble();
		Gross.GrossSalary = Gross.netsalary(Tax);
		System.out.println("Employee: " + Name +  ", $" + Gross.GrossSalary);
		System.out.println();
		System.out.println("Qual porcentagem vc quer aumentar o salario? ");
		Gross.ii = sc.nextDouble();
		Gross.incressedSalary();
		System.out.println("Update data: " + Name + ", $ " + Gross.GrossSalary);
		
		
		sc.close();
		
		
		
		

	}
	
	
}
