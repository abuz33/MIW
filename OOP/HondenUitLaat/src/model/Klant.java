package model;

public class Klant {
	private int klantnummer;
	private String voorletters;
	private String voorvoegsels;
	private String achternaam;
	private String telefoon;
	
	
	public Klant(int klantnummer, String voorletters, String voorvoegsels, String achternaam, String telefoon) {
		this.klantnummer = klantnummer;
		this.voorletters = voorletters;
		this.voorvoegsels = voorvoegsels;
		this.achternaam = achternaam;
		this.telefoon = telefoon;
	}
	
	public int getKlantnummer() {
		return klantnummer;
	}

	public void setKlantnummer(int klantnummer) {
		this.klantnummer = klantnummer;
	}

	public String getVoorvoegsels() {
		return voorvoegsels;
	}

	public void setVoorvoegsels(String voorvoegsels) {
		this.voorvoegsels = voorvoegsels;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getVoorletters() {
		return voorletters;
	}

	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}

	public String getTelefoon() {
		return telefoon;
	}

	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[Klant: ");
		result.append(klantnummer + " - ");
		result.append(voorletters + " ");
		if (voorvoegsels != null) {
			result.append(voorvoegsels + " ");
		}
		result.append(achternaam + " ");
		result.append(telefoon + "]");
		return result.toString();
	}
}
