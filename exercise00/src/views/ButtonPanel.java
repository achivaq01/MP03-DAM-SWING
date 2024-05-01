package views;

import javax.swing.*;
import java.awt.*;
import controllers.RadioButtonController;
import models.RadioButton;

public class ButtonPanel extends JPanel {
    private final RadioButtonController radioButtonController;
    private final ButtonGroup buttonGroup;

    public ButtonPanel(RadioButtonController radioButtonController) {
        super();
        this.radioButtonController = radioButtonController;
        this.buttonGroup = new ButtonGroup();

        initialize();
    }

    private void initialize() {
        initializeLayout();
        SwingUtilities.invokeLater(this::initializeButtons);
        this.setVisible(true);
    }

    private void initializeLayout() {
        int buttonCount = radioButtonController.getRadioButtonCount();
        setLayout(new GridLayout(1, buttonCount));
    }

    private void initializeButtons() {
        int buttonCount = radioButtonController.getRadioButtonCount();
        for (int i = 0; i < buttonCount; i++) {
            initializeButton(i);
        }
    }

    private void initializeButton(int buttonIndex) {
        RadioButton button = radioButtonController.getRadioButton(buttonIndex);
        JRadioButton jRadioButton = new JRadioButton(button.getLabel());
        jRadioButton.setSelected(button.getSelected());

        jRadioButton.addActionListener(e -> radioButtonController.selectRadioButton(buttonIndex));

        buttonGroup.add(jRadioButton);
        add(jRadioButton);
    }

}
