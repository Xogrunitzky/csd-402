/*
Xavier Grunitzky
Module 11.2 Assignment
3/15/26
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Example of VBox layout in JavaFX
 * Arranges buttons vertically in a single column.
 */
public class VBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        Button loginBtn = new Button("Login");
        Button registerBtn = new Button("Register");
        Button exitBtn = new Button("Exit");

        VBox vbox = new VBox();
        vbox.getChildren().addAll(loginBtn, registerBtn, exitBtn);
        vbox.setSpacing(15); // Vertical spacing
        vbox.setAlignment(Pos.CENTER); // Center buttons vertically and horizontally

        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
