package application;

import application.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import controler.*;

public class Main extends Application {
	private Database db;
	private FXMLLoader loader;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			db = new Database();
			loader = new FXMLLoader(getClass().getResource("/view/MasterOfTabs.fxml"));
			Parent root = loader.load();

			Scene scene = new Scene(root, 600, 440);
			scene.getStylesheets().add(getClass().getResource("/application/login.css").toExternalForm());
			MainController MC = (MainController) loader.getController();
			MC.setDatabase(db);

			if (!db.openConnection("db05", "nqe582gd")) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Database error");
				alert.setHeaderText(null);
				alert.setContentText("Could not connect to the database! Check console for details.");
				alert.showAndWait();
			}

			// show the main window
			primaryStage.setTitle("Cookies");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void stop() {
		// close the database here
		db.closeConnection();

		try {
			super.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
