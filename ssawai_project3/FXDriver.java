package ssawai_project3;
	
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: 
 * The FXDriver class is the main entry point for a JavaFX GUI application focused on 
 * cybersecurity encryption and decryption. It extends the Application class, making it a 
 * JavaFX application. This class is used as the main method.
 * Due: 03/17/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// call the main scene which is a BorderPane
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 600, 350));
		// Set stage title and show the stage.
		stage.setTitle("Cybersecurity Encryption and Decryption");
		stage.show();

	}
}
