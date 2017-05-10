
public class Pilot extends Teammitglieder{

	private int pilotNummer;
	private int anzahlSiege;
	
	public Pilot(String name, String vorname, String nationalitaet, int pilotNummer, int anzahlSiege) {
		super(name, vorname, nationalitaet);
		this.pilotNummer = pilotNummer;
		this.anzahlSiege = anzahlSiege;
	}
	
	
}
