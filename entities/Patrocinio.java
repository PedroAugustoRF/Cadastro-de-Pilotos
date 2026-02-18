package entities;

import java.util.ArrayList;
import java.util.List;

public class Patrocinio {
	private String patrocinadorMaster = null;
	private List<String> patrocinadores = new ArrayList<>();
	private Double rendaPatrocinio = null;
	
	public Patrocinio() {}
	
	public Patrocinio(String patrocinadorMaster, List<String> patrocinadores, Double rendaPatrocinio) {
		this.patrocinadorMaster = patrocinadorMaster;
		this.patrocinadores = patrocinadores;
		this.rendaPatrocinio = rendaPatrocinio;
	}

	public String getPatrocinadorMaster() {
		return patrocinadorMaster;
	}
	public void setPatrocinadorMaster(String patrocinadorMaster) {
		this.patrocinadorMaster = patrocinadorMaster;
	}

	public List<String> getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(List<String> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public Double getRendaPatrocinio() {
		return rendaPatrocinio;
	}
	public void setRendaPatrocinio(Double rendaPatrocinio) {
		this.rendaPatrocinio = rendaPatrocinio;
	}
	
	public String toString() {
		return "Patrocinador Master: " + patrocinadorMaster + "."
				+ "\nPatrocinadores: " + String.join(", ", patrocinadores) + "."
				+ "\nRenda de Patrocinio: " + String.format("%.2f", rendaPatrocinio) + ".";
	}
	
}
