package newpack.model;

public class MessageModel {
    private String message;

    public MessageModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String setNewMessage(String message){
        this.message += message;
        return this.message;
    }
}
