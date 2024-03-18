package view;

import java.text.NumberFormat;
import java.util.Currency;

import control.FinancialCalculations;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import validator.Validation;

public class InvestmentCalculator extends Application {

	private TextField investmentField;
	private TextField investmentRateField;
	private TextField yearField;
	private TextField futureInvestmentField;

	private double investment;
	private double rate;
	private int years;

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Stage title
		primaryStage.setTitle("Investment Calculator");

		// grid
		GridPane grid = new GridPane();

		// Label to grid
		grid.add(new Label("Monthly Investment: "), 0, 0);
		grid.add(new Label("Yearly Interest Rate: "), 0, 1);
		grid.add(new Label("Number of Years: "), 0, 2);
		grid.add(new Label("Future Value: "), 0, 3);

		// text fields
		investmentField = new TextField();
		grid.add(investmentField, 1, 0);

		investmentRateField = new TextField();
		grid.add(investmentRateField, 1, 1);

		yearField = new TextField();
		grid.add(yearField, 1, 2);

		futureInvestmentField = new TextField();
		futureInvestmentField.setEditable(false);
		grid.add(futureInvestmentField, 1, 3);

		// buttons
		Button calculateButton = new Button("Calculate");
		Button exitButton = new Button("Exit");

		calculateButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");
		exitButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");

		// Event handler
		calculateButton.setOnAction(event -> calculateButtonClicked());
		exitButton.setOnAction(event -> exitButtonClicked());

		// Hbox (horizontal box)
		HBox buttonBox = new HBox(15);

		// add buttons to Hbox
		buttonBox.getChildren().add(calculateButton);
		buttonBox.getChildren().add(exitButton);
		buttonBox.setAlignment(Pos.BASELINE_CENTER);

		// alignments
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.setHgap(10);
		grid.setVgap(10);

		grid.add(buttonBox, 0, 4, 2, 1);

		// add grid to scene
		Scene scene = new Scene(grid, 450, 200);

		// Set scene
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);

		// display stage
		primaryStage.show();
	}

	private void calculateButtonClicked() {

		Validation validation = new Validation();

		String warningMsg = "";

		warningMsg += validation.isPresent(investmentField.getText(), "Investment field");
		warningMsg += validation.isPresent(investmentRateField.getText(), "Rate field");
		warningMsg += validation.isPresent(yearField.getText(), "Years field");

		if (!warningMsg.isEmpty()) {

			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setHeaderText("Missing values/input!");
			alert.setContentText(warningMsg);
			alert.showAndWait();
			return;
		}

		String errorMsg = "";

		errorMsg += validation.isDouble(investmentField.getText(), "Investment field");
		errorMsg += validation.isDouble(investmentRateField.getText(), "Rate field");
		errorMsg += validation.isInteger(yearField.getText(), "Years field");

		if (!errorMsg.isEmpty()) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Invalid values/input!");
			alert.setContentText(errorMsg);
			alert.showAndWait();
			return;
		}

		investment = Double.parseDouble(investmentField.getText());
		rate = Double.parseDouble(investmentRateField.getText());
		years = Integer.parseInt(yearField.getText());

		double futureValue = FinancialCalculations.calculateFutureValue(investment, rate, years);

		NumberFormat currency = NumberFormat.getCurrencyInstance();

		Currency newCurrency = Currency.getInstance("USD");
		currency.setCurrency(newCurrency);

		futureInvestmentField.setText(currency.format(futureValue));

	}

	private void exitButtonClicked() {

		System.exit(0);
	}

	public static void main(String[] args) {

		launch(args);
	}

}
