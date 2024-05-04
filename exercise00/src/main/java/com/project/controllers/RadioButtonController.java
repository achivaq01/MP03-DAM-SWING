package com.project.controllers;

import com.project.models.RadioButton;

import javax.swing.*;
import java.util.List;

import static com.project.controllers.ResetController.updateLabelPart;

public class RadioButtonController {
    private final ButtonGroup buttonGroup;
    private final List<RadioButton> buttons;

    public RadioButtonController(List<RadioButton> buttons) {
        this.buttons = buttons;
        buttonGroup = new ButtonGroup();
        initializeButtons();
    }

    private void initializeButtons() {
        buttons.getFirst().setSelected(true);
        for (RadioButton radioButton : buttons) {
            radioButton.addActionListener(e -> {
                updateButtons(radioButton);
            });
            buttonGroup.add(radioButton);
        }

    }

    public void updateButtons(RadioButton selectedButton) {
        buttonGroup.clearSelection();
        buttonGroup.setSelected(selectedButton.getModel(), true);

        String selectedButtonText = selectedButton.getText();
        updateLabelPart(0, "Option " + selectedButtonText);
    }

    public List<RadioButton> getButtons() {
        return buttons;
    }
}
