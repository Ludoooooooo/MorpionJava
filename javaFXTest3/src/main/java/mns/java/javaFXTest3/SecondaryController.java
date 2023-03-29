package mns.java.javaFXTest3;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
 
    @FXML
    private void OnePlayer() throws IOException{
    	App.setRoot("primary");
    	System.out.println("Partie lancée contre l'IA !");
    }
    
    @FXML
    private void TwoPlayer() throws IOException{
    	App.setRoot("third");
    	System.out.println("Partie lancée en 1V1 !");
    }
}