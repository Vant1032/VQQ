package client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    private VBox vitalVBox;
    @FXML
    private ImageView avatar;
    @FXML
    private Text nickName;
    @FXML
    private TextField signature;
    @FXML
    private GridPane switchGridPane;
    @FXML
    private ImageView personalChat;
    @FXML
    private ImageView publicChat;
    @FXML
    private ListView chatList;
    @FXML
    private HBox bottom;
    @FXML
    private Button setting;

    public VBox getVitalVBox() {
        return vitalVBox;
    }

    public ImageView getAvatar() {
        return avatar;
    }

    public Text getNickName() {
        return nickName;
    }

    public TextField getSignature() {
        return signature;
    }

    public GridPane getSwitchGridPane() {
        return switchGridPane;
    }

    public ImageView getPersonalChat() {
        return personalChat;
    }

    public ImageView getPublicChat() {
        return publicChat;
    }

    public ListView getChatList() {
        return chatList;
    }

    public HBox getBottom() {
        return bottom;
    }

    public Button getSetting() {
        return setting;
    }
}
