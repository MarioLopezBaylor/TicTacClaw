package edu.baylor.ecs;

import javafx.scene.text.Font;

import static edu.baylor.ecs.MasterWindow.maxWidth;

public class TieBox extends AlertBox{
    public TieBox(String title, String message) {
        super(title, message);

        textbox.setFont((Font.font("System", maxWidth / 50)));
        display();
    }
}
