package newpack;

import newpack.controller.MessageController;
import newpack.model.MessageModel;
import newpack.view.MessageView;

public class Main {
    public static void main(String[] args) {

        MessageModel messageModel = new MessageModel("msg");
        MessageView messageView = new MessageView();
        MessageController messageController = new MessageController(messageView, messageModel);

        messageController.startView();
    }
}
