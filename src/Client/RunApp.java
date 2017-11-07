package Client;

import Client.viewmodel.MainUI;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Vant
 * @version 2017/11/3 上午 9:04
 */
public class RunApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new MainUI();
    }
}
