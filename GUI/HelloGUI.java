import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

public class HelloGUI extends Application
{

   public static void main(String[] args)
   {
      launch(args);
   }

   public void start(Stage primaryStage)
   {
      Label messageLabel = new Label("Hello World");
      
      HBox hbox = new HBox(messageLabel);
      
      Scene scene = new Scene(hbox);
      
      primaryStage.setScene(scene);
      
      primaryStage.setTitle("My First GUI");
      primaryStage.show();
   }
}//Hello gui end