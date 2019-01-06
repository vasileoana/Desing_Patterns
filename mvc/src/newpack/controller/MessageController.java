package newpack.controller;

import newpack.model.MessageModel;
import newpack.view.MessageView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageController {
    private MessageView messageView;
    private MessageModel messageModel;


    public MessageController(MessageView messageView, MessageModel messageModel) {
        this.messageView = messageView;
        this.messageView.setActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                System.out.println("Button was pressed");
                updateViewWithString(e.getActionCommand());
                messageView.displayMessage(messageModel.getMessage());
            }
        });
        this.messageModel = messageModel;

    }

    public void startView(){
        messageView.displayButton();
    }

    public void updateViewWithString(String string){
        messageView.displayMessage(messageModel.setNewMessage(string));
    }

}
