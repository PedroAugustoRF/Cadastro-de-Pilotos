package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Patrocinio;
import entities.Piloto;
import entities.enums.Equipes;
import entities.enums.Pistas;

public class AppCadastroPiloto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Em qual equipe você vai correr? ");
		String equipe = sc.nextLine();
		
		Equipes equipeEnum = Equipes.valueOf(equipe.toUpperCase().replace(" ", "_"));
		
		System.out.println("Digite suas informações de piloto: ");
		
		System.out.println("Nome: ");
		String nomePiloto = sc.nextLine();
		
		System.out.println("Idade: ");
		Integer idadePiloto = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Número: ");
		Integer numeroPiloto = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Pista Favorita: ");
		String pistaFavorita = sc.nextLine();
		
		Pistas pistaEnum = Pistas.valueOf(pistaFavorita.toUpperCase().replace(" ", "_"));
		
		System.out.println("Salário base: ");
		Double salarioBase = sc.nextDouble();
		sc.nextLine();
		
		Piloto infoPiloto = new Piloto(nomePiloto, idadePiloto, equipeEnum, numeroPiloto, pistaEnum, salarioBase);
		
		System.out.println("Qual seu Patrocinador Master?");
		String patrocinadorMaster = sc.nextLine();
		
		System.out.println("Você tem quantos patrocinadores normais? ");
		int qtdPatrocinadores = sc.nextInt();
		sc.nextLine();
		
		List<String> patrocinadores = new ArrayList<>();
		
		for(int i = 1; i <= qtdPatrocinadores; i++) {
			System.out.println("Digite o patrocinador #" + i + ": ");
			String patrocinador = sc.nextLine();
			
			patrocinadores.add(patrocinador);
		}
		
		System.out.println("Quanto você recebe de patrocinio? ");
		Double rendaPatrocinios = sc.nextDouble();
		sc.nextLine();
		
		Patrocinio patrocinios = new Patrocinio(patrocinadorMaster, patrocinadores, rendaPatrocinios);
		
		Contrato contrato = new Contrato(infoPiloto, patrocinios);
		
		contrato.calcularSalarioFinal();
		
		System.out.println(infoPiloto);
		System.out.println(patrocinios);
		System.out.println(contrato);
		
		sc.close();
	}
}
