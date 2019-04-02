package Restaurant.Fachlogik.Tischverwaltung;

import java.sql.Time;
import java.util.Date;

public class Reservierung {
	
	private Date datum;
	private Time uhrzeit;
	private int personen;
	private String name;
	
	public Reservierung(Date datum, Time uhrzeit, int personen, String name) {
		this.datum = datum;
		this.uhrzeit = uhrzeit;
		this.personen = personen;
		this.name = name;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Time getUhrzeit() {
		return uhrzeit;
	}

	public void setUhrzeit(Time uhrzeit) {
		this.uhrzeit = uhrzeit;
	}

	public int getPersonen() {
		return personen;
	}

	public void setPersonen(int personen) {
		this.personen = personen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
