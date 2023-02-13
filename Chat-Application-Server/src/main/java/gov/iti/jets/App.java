package gov.iti.jets;

import java.util.ArrayList;

import gov.iti.jets.business.rmi.RMIConnection;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.persistence.dao.UserImpl;
import gov.iti.jets.persistence.dao.countryDaoImpl;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.utils.DBConnecttion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        // Parent root = FXMLLoader.load(getClass().getResource("/views/MainPanelView.fxml"));
        // DBConnecttion.getConnection();
        // Scene sc = new Scene(root, 800, 600);
        // primaryStage.setScene(sc);
        // primaryStage.setTitle("Chat Application");
        // primaryStage.show();

    }

    public static void main(String[] args) {
        RMIConnection rmi = RMIConnection.getInstance();
        DBConnecttion.getConnection();
        rmi.connect();
        Application.launch(args);
    }
}
