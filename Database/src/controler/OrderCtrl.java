package controler;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

public class OrderCtrl extends PageJavaFx {
	Database db;
	@FXML ListView<String> CookieList;
	@FXML DatePicker DeliveryDate; 
	private LocalDate Date; 
	@Override
	public void initialize() {
		//Ladda in alla kakor

	}

	@Override
	public void ButtonPress(ActionEvent e) {
		Date = DeliveryDate.getValue();
		//Skapa en order med hj�lp av Date och vald kaka.
	}

	@Override
	public void setDatabase(Database db) {
		this.db=db;

	}
	//g�r denna? //M�ns dunno
	public void userChanged() {
		// TODO Auto-generated method stub

	}

}
