import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

scene.getStylesheets().add("styles.css");

public class CampusBodaApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Campus Boda");

        // Create the main layout
        VBox mainLayout = new VBox();
        Scene scene = new Scene(mainLayout, 800, 600);

        // Add login screen or main menu
        mainLayout.getChildren().add(new LoginScreen().getLayout());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
