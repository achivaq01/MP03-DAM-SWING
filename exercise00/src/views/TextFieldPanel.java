package views;

import controllers.TextFieldController;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {
    private TextFieldController controller;

    public TextFieldPanel() {
        controller = new TextFieldController();

        initializeComponents();
        this.setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new GridLayout(1, 1));
        setBorder(BorderFactory.createTitledBorder("TextField"));
        add(controller.getTextField());
    }

    public TextFieldController getController() {
        return controller;
    }
}
