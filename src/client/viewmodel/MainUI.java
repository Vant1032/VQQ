package client.viewmodel;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author Vant
 * @version 2017/11/7 下午 1:59
 */
public class MainUI {
    Stage mainUIStage;

    public MainUI() {
        mainUIStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("client/fxml/Main.fxml"));
        Parent parent = null;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(parent);
        mainUIStage.setScene(scene);


        mainUIStage.setTitle("VQQ");
        mainUIStage.setResizable(false);
        mainUIStage.setAlwaysOnTop(true);
        mainUIStage.initStyle(StageStyle.UNIFIED);
        mainUIStage.show();
    }
}
