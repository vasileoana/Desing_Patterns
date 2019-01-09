package newpack.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MessageView {


    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void displayMessage(String string){
        System.out.println("message displayed: " + string);
        displayButton();
    }




    public void displayButton(){

        System.out.println("Enter new message to concatenate it the old one!");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        this.actionListener.actionPerformed(new ActionEvent(this, 1, line));
    }

}
