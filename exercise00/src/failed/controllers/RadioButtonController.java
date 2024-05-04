package failed.controllers;

import failed.models.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class RadioButtonController {
    private final List<RadioButton> radioButton;

    public RadioButtonController() {
        radioButton = new ArrayList<>();
    }

    public int getRadioButtonCount() {
        return radioButton.size();
    }

    public void addRadioButton(RadioButton radioButton) {
        this.radioButton.add(radioButton);
    }

    public RadioButton getRadioButton(int index) {
        return radioButton.get(index);
    }

    public void selectRadioButton(int index) {
        for (int i = 0; i < radioButton.size(); i++) {
            radioButton.get(i).setSelected(i == index);
        }
    }

    public int getSelectedRadioButtonIndex() {
        int i;
        for (i = 0; i < radioButton.size(); i++) {
            if (radioButton.get(i).getSelected()) {
                return i;
            }
        }
        return i;
    }
}
