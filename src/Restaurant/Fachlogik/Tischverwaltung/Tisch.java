package Restaurant.Fachlogik.Tischverwaltung;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Tisch extends Button {

	protected int tischNr;
	protected int sitzplaetze;
	protected int anzReservierungen;
	protected Color farbe, stuhlFarbe;
	protected double x, y;
	protected double rand = 10;
	protected double stuhlBreite = 30, stuhlTiefe = 10, stuhlAbstand = 5, stuhlBreiteGes;
	protected Rectangle[] stuehle;

	public Tisch()
	{
		
	}
	
	public Tisch(int tischNr, double x, double y) {
		this.tischNr = tischNr;
		this.x = x;
		this.y = y;
		stuhlFarbe = new Color(0.2, 0.8, 0.2, 1);
		farbe = new Color(0.713, 0.7, 0.827, 1);
		stuhlBreiteGes = 2 * stuhlAbstand + stuhlBreite;
		setTranslateX(x);
		setTranslateY(y);
		setOpacity(1);
		setStyle("-fx-background-color: #2E2E2E; ");
		setText("" + tischNr);
	}

	public void setSitzplaetze(int sitzplaetze) {
		if (sitzplaetze <= getMaxSitzplaetze())
			this.sitzplaetze = sitzplaetze;

		stuehle = new Rectangle[sitzplaetze];
		for (int i = 0; i < sitzplaetze; i++) {
			stuehle[i] = new Rectangle(stuhlTiefe, stuhlBreite, stuhlFarbe);
		}
		verteileStuehle();
	}

	public abstract void erstelleDesign();

	public abstract int getMaxSitzplaetze();

	public abstract void verteileStuehle();

	public int getTischNr() {
		return tischNr;
	}

	public void setTischNr(int tischNr)
	{
		this.tischNr = tischNr;
	}
	
	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void erhoeheAnzReservierungen() {
		anzReservierungen++;
		if (anzReservierungen <= 1)
			setStuhlFarbe(Color.YELLOW);
		else
			setStuhlFarbe(Color.RED);
	}

	public void veringereAnzReservierungen() {
		anzReservierungen--;
		if (anzReservierungen < 1)
			setStuhlFarbe(stuhlFarbe);
		else if (anzReservierungen == 1)
			setStuhlFarbe(Color.YELLOW);
		else
			setStuhlFarbe(Color.RED);
	}

	public void anzReservierungenZuruecksetzen() {
		anzReservierungen = 0;
		setStuhlFarbe(stuhlFarbe);
	}

	private void setStuhlFarbe(Color c) {
		for (Rectangle stuhl : stuehle) {
			stuhl.setFill(c);
		}
	}
	
	public void setAnzahlReservierungen(int n)
	{
		this.anzReservierungen = n;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}

}
