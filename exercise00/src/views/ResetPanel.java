package views;

import controllers.RadioButtonController;
import controllers.ResetController;
import controllers.TextFieldController;
import controllers.VolumeSliderController;

import javax.swing.*;
import java.awt.*;

public class ResetPanel extends JPanel {
    ResetController controller;

    public ResetPanel(RadioButtonController radioButtonController, VolumeSliderController volumeSliderController, TextFieldController textFieldController) {
        super();
        controller = new ResetController(radioButtonController, volumeSliderController, textFieldController);

        initializeComponents();
        this.setVisible(true);
    }

    public void initializeComponents() {
        setLayout(new GridLayout(2, 1));
        setBorder(BorderFactory.createTitledBorder("Reset"));
        add(controller.getLabel());
        add(controller.getResetButton());
    }


}
