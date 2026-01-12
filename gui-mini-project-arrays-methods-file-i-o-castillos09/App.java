import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;



/**
 * Template JavaFX application.
 */
public class App extends Application {
  
  
  
  boolean started;
    


    


  
  
  
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        // Create components to add.
        VBox game = new VBox();
    

        HBox buttonsrow = new HBox();

        Button start = new Button("Start");
         
        

        Button[] mineArray = new Button[10];
        for(int i = 0; i<mineArray.length;i++){

        }

        Label minesamountLabel = new Label("Number of Mines:");
        
       Slider minesAmount = new Slider(0, 100, 10);
        minesAmount.setMajorTickUnit(50);
        minesAmount.setShowTickLabels(true);

        int mines = (int) minesAmount.getValue();

        TextArea messageBox = new TextArea();
        messageBox.setEditable(false);

        game.getChildren().addAll(buttonsrow);
        buttonsrow.getChildren().addAll(mineArray,minesamountLabel,minesAmount);

        

       
        // Set up the window and display it.
        Scene scene = new Scene (game, 1000, 1000);
        stage.setScene(scene);
        stage.setTitle("Casino Mines");
        stage.show();
    }

    /**
     * Handle the submission of a thought.
     * @param inputBox  The TextField where the user types their thought.
     * @param outputBox The TextArea where the submitted thoughts are displayed.
     */
    
} 
