package entities;

import entities.enums.Equipes;
import entities.enums.Pistas;

public class Piloto {
	private String nomePiloto = null;
	private Integer idadePiloto = null;
	private Equipes equipe = null;
	private Integer numeroPiloto = null;
	private Pistas pistaFavorita = null;
	private Double salarioBase = null;
	
	public Piloto() {}

	public Piloto(String nomePiloto, Integer idadePiloto, Equipes equipe, Integer numeroPiloto, Pistas pistaFavorita, Double salarioBase) {
		this.nomePiloto = nomePiloto;
		this.idadePiloto = idadePiloto;
		this.equipe = equipe;
		this.numeroPiloto = numeroPiloto;
		this.pistaFavorita = pistaFavorita;
		this.salarioBase = salarioBase;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public Integer getIdadePiloto() {
		return idadePiloto;
	}
	public void setIdadePiloto(Integer idadePiloto) {
		this.idadePiloto = idadePiloto;
	}

	public Equipes getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipes equipe) {
		this.equipe = equipe;
	}

	public Pistas getPistaFavorita() {
		return pistaFavorita;
	}
	public void setPistaFavorita(Pistas pistaFavorita) {
		this.pistaFavorita = pistaFavorita;
	}

	public Integer getNumeroPiloto() {
		return numeroPiloto;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public String toString() {
		return "Nome do Piloto: " + nomePiloto + "."
				+ "\nIdade: " + idadePiloto + "."
				+ "\nEquipe: " + equipe + "."
				+ "\nNúmero: " + numeroPiloto + "."
				+ "\nPista Favorita: " + pistaFavorita + "."
				+ "\nSalário base: $" + String.format("%.2f", salarioBase) + ".";
	}
	
}
