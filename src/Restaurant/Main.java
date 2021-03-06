package Restaurant;
	
import Restaurant.Datenhaltung.DatenModell;
import Restaurant.UI.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		new MainView(new DatenModell(primaryStage));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
