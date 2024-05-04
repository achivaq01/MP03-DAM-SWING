package views;

import controllers.RadioButtonController;
import models.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RadioButtonPanel extends JPanel {
    RadioButtonController controller;
    List<RadioButton> buttons;

    public RadioButtonPanel(List<RadioButton> buttons) {
        this.buttons = buttons;
        controller = new RadioButtonController(buttons);

        initializeComponents();
        this.setVisible(true);
    }

    public void initializeComponents() {
        int rows = buttons.size();
        int columns = 1;
        setLayout(new GridLayout(columns, rows));
        setBorder(BorderFactory.createTitledBorder("Buttons"));
        addButtons();
    }

    public RadioButtonController getController() {
        return controller;
    }

    public void addButtons() {
        for (RadioButton radioButton : buttons) {
            add(radioButton);
        }
    }


}
