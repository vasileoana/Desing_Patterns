package exemplu_seminar;

import java.util.ArrayList;
import java.util.List;

public class Chat extends Mediator {
   List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }
    @Override
    public void sendMessage(String message) {
        for(User user: users){
            user.receiveMessage(message);
        }
    }
}
