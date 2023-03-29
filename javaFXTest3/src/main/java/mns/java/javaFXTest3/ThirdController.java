package mns.java.javaFXTest3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThirdController {
	
	
	List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	List<Integer> joueur = new ArrayList<>(Arrays.asList());
	
	List<Integer> machine = new ArrayList<>(Arrays.asList());
	
	Integer game = 0;
	Integer Quijoue = 1;
	@FXML
	private Label textenbParties;
	
	
    @FXML
    private Button c1, c2, c3, c4, c5, c6, c7, c8, c9;
    @FXML
    private void switchToSecondary() throws IOException{
        App.setRoot("secondary");
    }
    
    
    
    @FXML
    private void jouerC1() {
    	
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 1");
    		c1.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 1");
            c1.setText("O");
    	}
        Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(1));    
        c1.setDisable(true);
        joueur.add(1);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC2() {
    	
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 2");
    		c2.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 2");
            c2.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(2));    
        c2.setDisable(true);
        joueur.add(2);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC3() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 3");
    		c3.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 3");
            c3.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(3));    
        c3.setDisable(true);
        joueur.add(3);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC4() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 4");
    		c4.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 4");
            c4.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(4));    
        c4.setDisable(true);
        joueur.add(4);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC5() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 5");
    		c5.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 5");
            c5.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(5));    
        c5.setDisable(true);
        joueur.add(5);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC6() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 6");
    		c6.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 6");
            c6.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(6));    
        c6.setDisable(true);
        joueur.add(6);
        quiGagne();
        condVictoire();
    }
    
    @FXML
    private void jouerC7() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 7");
    		c7.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 7");
            c7.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(7));    
        c7.setDisable(true);
        joueur.add(7);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC8() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 8");
    		c8.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 8");
            c8.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(8));    
        c8.setDisable(true);
        joueur.add(8);
        quiGagne();
        condVictoire();
    }
    @FXML
    private void jouerC9() {
        
    	if (Quijoue%2 == 0) {
    		System.out.println("Joueur 1 joue la Case 9");
    		c9.setText("X");
    	}
    	else 
    	{
    		System.out.println("Joueur 2 joue la Case 9");
            c9.setText("O");
    	}
    	Quijoue = Quijoue +1;
        list.remove(Integer.valueOf(9));    
        c9.setDisable(true);
        joueur.add(9);
        quiGagne();
        condVictoire();
    }
    
    
    //List<Integer> victoire = new ArrayList<>(Arrays.asList(123,456,789,147,258,369,159,357));
    
    
    private void condVictoire() {
    	
    	
    	if (c1.getText() == "X" && c1.getText() == c2.getText() && c2.getText() == c3.getText() ) {
    		game = 1;
    	}
    	if (c4.getText() == "X" && c4.getText() == c5.getText() && c5.getText() == c6.getText() ) {
    		game = 1;
    	}
    	if (c7.getText() == "X" && c7.getText() == c8.getText() && c8.getText() == c9.getText() ) {
    		game = 1;
    	}
    	if (c1.getText() == "X" && c1.getText() == c4.getText() && c4.getText() == c7.getText() ) {
    		game = 1;
    	}
    	if (c2.getText() == "X" && c2.getText() == c5.getText() && c5.getText() == c8.getText() ) {
    		game = 1;
    	}
    	if (c3.getText() == "X" && c3.getText() == c6.getText() && c6.getText() == c9.getText() ) {
    		game = 1;
    	}
    	if (c1.getText() == "X" && c1.getText() == c5.getText() && c5.getText() == c9.getText() ) {
    		game = 1;
    	}
    	if (c3.getText() == "X" && c3.getText() == c5.getText() && c5.getText() == c7.getText() ) {
    		game = 1;
    	}
    	
    	
    	if (c1.getText() == "O" && c1.getText() == c2.getText() && c2.getText() == c3.getText() ) {
    		game = 2;
    	}
    	if (c4.getText() == "O" && c4.getText() == c5.getText() && c5.getText() == c6.getText() ) {
    		game = 2;
    	}
    	if (c7.getText() == "O" && c7.getText() == c8.getText() && c8.getText() == c9.getText() ) {
    		game = 2;
    	}
    	if (c1.getText() == "O" && c1.getText() == c4.getText() && c4.getText() == c7.getText() ) {
    		game = 2;
    	}
    	if (c2.getText() == "O" && c2.getText() == c5.getText() && c5.getText() == c8.getText() ) {
    		game = 2;
    	}
    	if (c3.getText() == "O" && c3.getText() == c6.getText() && c6.getText() == c9.getText() ) {
    		game = 2;
    	}
    	if (c1.getText() == "O" && c1.getText() == c5.getText() && c5.getText() == c9.getText() ) {
    		game = 2;
    	}
    	if (c3.getText() == "O" && c3.getText() == c5.getText() && c5.getText() == c7.getText() ) {
    		game = 2;
    	}
    	
    	if (game == 1) {
    		System.out.println("Victoire du Joueur 1 !");
    		//Thread.sleep(10000);
    		try {
				switchToSecondary();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	if (game == 2) {
    		System.out.println("Victoire du Joueur 2 !");
    		try {
				switchToSecondary();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	
    }
    
    
    
    private void quiGagne() { 
    	
    	
    	if (list.isEmpty()) {
    		System.out.println("La liste est vide");
    	}
    	else {
    		Object item = list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
	    	int i = (int) item;
	    	list.remove(Integer.valueOf(i));
    	
    	
    }
    }
}
