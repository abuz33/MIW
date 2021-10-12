package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("HELLOOOOOOO!!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.DARKSEAGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.2);
        line.setRotate(45);

        root.getChildren().add(text);
        root.getChildren().add(line);


//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Scene scene = new Scene(root, 420, 420, Color.GRAY);
//        Image icon = new Image("resources/istockphoto-496603666-170667a.jpeg");
//
//        stage.getIcons().add(icon);
//        stage.setResizable(false);

        // stage.setX(50);
        // stage.setY(50);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("You cannot escape without pressing \"q\"");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        //stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
