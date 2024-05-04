package failed.controllers;

import failed.models.VolumeSlider;

public class VolumeSliderController {
    private final VolumeSlider volumeSlider;

    public VolumeSliderController(VolumeSlider volumeSlider) {
        this.volumeSlider = volumeSlider;
    }

    public void setVolumeSliderValue(int value) {
        volumeSlider.setValue(value);
    }

    public int getVolumeSliderValue() {
        return volumeSlider.getValue();
    }

    public VolumeSlider getVolumeSlider() {
        return volumeSlider;
    }
}
