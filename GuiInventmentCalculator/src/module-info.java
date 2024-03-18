module GuiInventmentCalculator {
	requires javafx.graphics;
	requires javafx.controls;
	
	opens view to javafx.fxml;
	opens control to javafx.fxml;
	opens validator to javafx.fxml;
	
	exports view;
	exports control;
	exports validator;
}