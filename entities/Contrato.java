package entities;

import java.util.Scanner;

public class Contrato {
	
	Scanner sc = new Scanner(System.in);
	
	private Piloto infoPiloto = null;
	private Patrocinio patrocinio = null;
	private Double salarioFinal = null;
	
	public Contrato(Piloto infoPiloto, Patrocinio patrocinio) {
		this.infoPiloto = infoPiloto;
		this.patrocinio = patrocinio;
	}
	
	double salarioBase = 0.0;
	double rendaPatrocinio = 0.0;
	double bonificacao = 0.0;
	
	public void calcularSalarioFinal() {
		
		salarioBase = infoPiloto.getSalarioBase();
		rendaPatrocinio = patrocinio.getRendaPatrocinio();
		
		System.out.println("Você recebe bonificação por ficar no pódio? <S>/<N>");
		char recebeBonus = sc.next().toUpperCase().charAt(0);
		if(recebeBonus == 'S') {
			System.out.println("Quantas corridas você ficou no pódio? ");
			int qtdPodios = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Quanto você recebe de bonus por pódio? ");
			double valorBonus = sc.nextDouble();
			sc.nextLine();
			
			bonificacao = valorBonus * qtdPodios;
			
			this.salarioFinal = salarioBase + rendaPatrocinio + bonificacao;
		}
		else
			this.salarioFinal = salarioBase + rendaPatrocinio;
	}
	
	public String toString() {
		return "Salario base: $" + String.format("%.2f", salarioBase) + "."
				+"\nRenda de Patrocinio: $" + String.format("%.2f", rendaPatrocinio) + "."
				+"\nBonificação: $" + String.format("%.2f", bonificacao) + "."
				+"\nSalário Final: $" + String.format("%.2f", salarioFinal) + ".";
	}
	
}
