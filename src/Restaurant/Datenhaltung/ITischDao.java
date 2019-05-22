package Restaurant.Datenhaltung;

import java.util.ArrayList;
import Restaurant.Fachlogik.Tischverwaltung.Tisch;

public interface ITischDao {

	public void speichern(ArrayList<Tisch> tische);
	public ArrayList<Tisch> laden();
}
