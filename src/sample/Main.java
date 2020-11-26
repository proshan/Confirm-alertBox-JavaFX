package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


//handling user events

public class Main extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }
    //comments added
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Java-FX");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        public void nothing(){
            //does nothing;
        }
        button = new Button();
        button.setText("Close");

        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 250, 250);

        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.displayAlert("Title", "You really want to exit?");
        if(answer == true) {
            window.close();
        }
    }
}

