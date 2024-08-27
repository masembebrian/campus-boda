import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class RideBookingScreen {

    private VBox layout;

    public RideBookingScreen() {
        layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        Label pickupLabel = new Label("Pickup Location:");
        TextField pickupField = new TextField();
        Label dropoffLabel = new Label("Dropoff Location:");
        TextField dropoffField = new TextField();
        Button bookRideButton = new Button("Book Ride");

        bookRideButton.setOnAction(e -> {
            // Handle ride booking logic
        });

        GridPane form = new GridPane();
        form.setVgap(10);
        form.setHgap(10);
        form.add(pickupLabel, 0, 0);
        form.add(pickupField, 1, 0);
        form.add(dropoffLabel, 0, 1);
        form.add(dropoffField, 1, 1);
        form.add(bookRideButton, 1, 2);

        layout.getChildren().add(form);
    }

    public VBox getLayout() {
        return layout;
    }
}
