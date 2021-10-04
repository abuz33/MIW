package model;

public class Medewerker {
	private String medewerkerNummer;
	private String medewerkerNaam;
	
	public Medewerker(String medewerkerNummer, String medewerkerNaam) {
		this.medewerkerNummer = medewerkerNummer;
		this.medewerkerNaam = medewerkerNaam;
	}

	public String getMedewerkerNummer() {
		return medewerkerNummer;
	}

	public void setMedewerkerNummer(String medewerkerNummer) {
		this.medewerkerNummer = medewerkerNummer;
	}

	public String getMedewerkerNaam() {
		return medewerkerNaam;
	}

	public void setMedewerkerNaam(String medewerkerNaam) {
		this.medewerkerNaam = medewerkerNaam;
	}
	
	@Override
	public String toString() {
		return String.format("[Medewerker %s - %s]", medewerkerNummer, medewerkerNaam);
	}
}
