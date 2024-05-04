package com.project.controllers;

import com.project.models.VolumeSlider;

import static com.project.controllers.ResetController.updateLabelPart;

public class VolumeSliderController {
    private VolumeSlider volumeSlider;

    public VolumeSliderController(int min, int max, int value) {
        volumeSlider = new VolumeSlider(min, max, value);
        initializeVolumeSlider();
    }

    private void initializeVolumeSlider() {
        volumeSlider.setMajorTickSpacing(50);
        volumeSlider.setMinorTickSpacing(10);
        volumeSlider.setPaintLabels(true);
        volumeSlider.setPaintTrack(true);
        volumeSlider.setPaintTicks(true);

        volumeSlider.addChangeListener(e ->  {
            int value = ((VolumeSlider) e.getSource()).getValue();
            updateVolumeSlider(value);
            updateLabelPart(1, "Volume: " + value);
        });
    }

    public void updateVolumeSlider(int value) {
        volumeSlider.setValue(value);
    }

    public VolumeSlider getVolumeSlider() {
        return volumeSlider;
    }
}
