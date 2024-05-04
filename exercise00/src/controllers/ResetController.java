package controllers;

import javax.swing.*;

public class ResetController {
    private final RadioButtonController radioButtonController;
    private final VolumeSliderController volumeSliderController;
    private final TextFieldController textFieldController;
    private JButton resetButton;
    private static JLabel label;

    public ResetController(RadioButtonController radioButtonController, VolumeSliderController volumeSliderController, TextFieldController textFieldController) {
        this.radioButtonController = radioButtonController;
        this.volumeSliderController = volumeSliderController;
        this.textFieldController = textFieldController;
        initializeResetButton();
        initializeLabel();
    }

    private void initializeResetButton() {
        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
           radioButtonController.updateButtons(radioButtonController.getButtons().getFirst());
           volumeSliderController.updateVolumeSlider(0);
           textFieldController.updateTextField("");
        });
    }

    private void initializeLabel() {
        label = new JLabel();
        label.setText("Option: option1 , Volume: 0, Text: ");
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public static void updateLabelPart(int partIndex, String newText) {
        String labelText = label.getText();
        String[] parts = labelText.split(",");
        if (partIndex >= 0 && partIndex < parts.length) {
            parts[partIndex] = newText;
            labelText = String.join(",", parts);
            label.setText(labelText);
        }
    }


}
