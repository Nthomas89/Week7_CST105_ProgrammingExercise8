/*
 * Program: Exercise 8 (Ch. 14 exercise 4)
 * File: ColorAndFont.java
 * Summary: Displays text vertically in different colors
 * Author: Nicholas Thomas
 * Date: January 14, 2017
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.HBox;


public class ColorAndFont extends Application {
	@Override
    public void start(Stage primaryStage) {
		Pane pane = new HBox(10);
		pane.setPadding(new Insets (10,10,10,10));
		Text text1 = new Text("JAVA");
		text1.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text1.setOpacity(Math.random());
		text1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		text1.setRotate(90);
		text1.setTranslateY(20);
		pane.getChildren().add(text1);
		//2nd text
		Text text2 = new Text("JAVA");
		text2.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text2.setOpacity(Math.random());
		text2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		text2.setRotate(90);
		text2.setTranslateY(20);
		pane.getChildren().add(text2);
		//3rd text
		Text text3 = new Text("JAVA");
		text3.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text3.setOpacity(Math.random());
		text3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		text3.setRotate(90);
		text3.setTranslateY(20);
		pane.getChildren().add(text3);
		//4th text
		Text text4 = new Text("JAVA");
		text4.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text4.setOpacity(Math.random());
		text4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		text4.setRotate(90);
		text4.setTranslateY(20);
		pane.getChildren().add(text4);
		//5th text
		Text text5 = new Text("JAVA");
		text5.setFont(Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 22));
		text5.setOpacity(Math.random());
		text5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		text5.setRotate(90);
		text5.setTranslateY(20);
		pane.getChildren().add(text5);

        Scene scene = new Scene(pane, 350, 150);
		primaryStage.setTitle("showText");
		primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
