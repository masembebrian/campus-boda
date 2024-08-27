import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class WalletScreen {

    private VBox layout;

    public WalletScreen() {
        layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        Label walletBalanceLabel = new Label("Wallet Balance: $0.00");
        Label amountLabel = new Label("Amount to Deposit:");
        TextField amountField = new TextField();
        Button depositButton = new Button("Deposit");

        depositButton.setOnAction(e -> {
            // Handle deposit logic
        });

        GridPane form = new GridPane();
        form.setVgap(10);
        form.setHgap(10);
        form.add(walletBalanceLabel, 0, 0);
        form.add(amountLabel, 0, 1);
        form.add(amountField, 1, 1);
        form.add(depositButton, 1, 2);

        layout.getChildren().add(form);
    }

    public VBox getLayout() {
        return layout;
    }
}
