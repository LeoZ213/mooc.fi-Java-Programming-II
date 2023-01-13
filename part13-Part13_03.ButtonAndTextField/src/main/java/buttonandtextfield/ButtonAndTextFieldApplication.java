package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application{
        @Override
        public void start(Stage window) {
            Button buttonComponent = new Button("This is a button!");
            TextField textFieldComponent = new TextField();
            
            FlowPane componentGroup = new FlowPane();
            componentGroup.getChildren().add(buttonComponent);
            componentGroup.getChildren().add(textFieldComponent);
            
            Scene view = new Scene(componentGroup);
            
            window.setScene(view);
            window.show();
        }

    public static void main(String[] args){

        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
