package controler;

import application.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.*;

public abstract class PageJavaFx extends AnchorPane   {
	public abstract void initialize();
    public abstract void ButtonPress(ActionEvent e);
    public abstract void setDatabase(Database db);
}
