/*
Xavier Grunitzky
Module 11.2 Assignment
3/15/26
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Example of HBox layout in JavaFX
 * Arranges buttons horizontally in a single row.
 */
public class HBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        Button homeBtn = new Button("Home");
        Button profileBtn = new Button("Profile");
        Button settingsBtn = new Button("Settings");

        HBox hbox = new HBox();
        hbox.getChildren().addAll(homeBtn, profileBtn, settingsBtn);
        hbox.setSpacing(20); // Horizontal spacing
        hbox.setAlignment(Pos.CENTER); // Center buttons horizontally

        Scene scene = new Scene(hbox, 400, 150);

        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}