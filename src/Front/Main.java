package Front;

import Back.Card;
import Back.api.ScryFall.ScryReader;
import Back.fileManager.DeckReader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Main extends Application {

    ArrayList<String> deckNames = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{

        //read deck Files
        deckNames = DeckReader.readNames();

        MainFrame mainFrame = new MainFrame(deckNames, 800, 600);
        Scene scene = new Scene(mainFrame);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        Card card = new Card("Sulfur Falls", "DAR");
        System.out.println(ScryReader.getImageFromCard(card));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
