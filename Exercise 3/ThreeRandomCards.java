/*
 * Program: Exercise 8 (Ch. 14 exercise 3)
 * File: ThreRandonCards.java
 * Summary: Displays three random cards each try
 * Author: Nicholas Thomas
 * Date: January 14, 2017
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ThreeRandomCards extends Application {
	@Override
	public void start (Stage primaryStage){
		
		int rando1 =  (int)(Math.random() * 53);
		int rando2 =  (int)(Math.random() * 53);
		int rando3 =  (int)(Math.random() * 53);
		
	    Image card1 = new Image("deck/"+rando1+".png");
	    Image card2 = new Image("deck/"+rando2+".png");
	    Image card3 = new Image("deck/"+rando3+".png");
		
		// making my container to hold three cards
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		ImageView cardone = new ImageView(card1);
		//pane.getChildren().add(new ImageView(image));
		//second image
		ImageView cardtwo = new ImageView(card2);
		//pane.getChildren().add(card2);
		//third image
		ImageView cardthree = new ImageView(card3);
		//pane.getChildren().add(card3);
		pane.getChildren().addAll(cardone, cardtwo, cardthree);

		//making my scene for look and feel
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Three Random Cards");
		primaryStage.setWidth(200);
		primaryStage.setHeight(200);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();			
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
