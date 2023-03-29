package mns.java.javaFXTest3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application { 

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, SQLException {
        scene = new Scene(loadFXML("secondary"), 450, 480);
        stage.setScene(scene);
        stage.show();
        
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //définit le driver à utiliser
	        Connection con=DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/java1","root","");
	        System.out.println("Connecté à la Base de Données");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}