package Model;

import java.util.EventListener;

public interface MyActionListenerAdapter extends EventListener {

    public void actionPerformed(MyActionEventAdapter e);
}
