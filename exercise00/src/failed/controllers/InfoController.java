package failed.controllers;

import java.util.Observable;

public class InfoController extends Observable {
    private RadioButtonController radioButtonController;
    private TextFieldController textFieldController;
    private VolumeSliderController volumeSliderController;

    public InfoController(
            RadioButtonController radioButtonController,
            TextFieldController textFieldController,
            VolumeSliderController volumeSliderController) {

        this.radioButtonController = radioButtonController;
        this.textFieldController = textFieldController;
        this.volumeSliderController = volumeSliderController;
        setChanged();
        notifyObservers();
    }

    public RadioButtonController getRadioButtonController() {
        return radioButtonController;
    }

    public TextFieldController getTextFieldController() {
        return textFieldController;
    }

    public VolumeSliderController getVolumeSliderController() {
        return volumeSliderController;
    }

    private void resetRadioButtonController() {
        RadioButtonController radioButtonController = getRadioButtonController();
        radioButtonController.selectRadioButton(0);

    }

    private void resetTextFieldController() {
        getTextFieldController().setTextFieldText("");
    }

    private void resetVolumeSliderController() {
        getVolumeSliderController().setVolumeSliderValue(0);
    }

    public void resetValues() {
        resetRadioButtonController();
        resetTextFieldController();
        resetVolumeSliderController();
    }
}
