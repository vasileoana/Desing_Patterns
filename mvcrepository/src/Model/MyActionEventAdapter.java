package Model;

import java.awt.event.ActionEvent;

public class MyActionEventAdapter extends ActionEvent {
    private static int id = 0;

    public MyActionEventAdapter(Object obj, String value) {
        super(obj, id++, value);
    }

    public MyActionEventAdapter(Object obj) {
        super(obj, id++, "");
    }

    public Object getObject() {
        return super.getSource();
    }

    public String getValue() {
        return super.getActionCommand();
    }
}
