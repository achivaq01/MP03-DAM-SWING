package com.project.views;

import com.project.controllers.VolumeSliderController;

import javax.swing.*;
import java.awt.*;

public class VolumeSliderPanel extends JPanel {
    VolumeSliderController controller;

    public VolumeSliderPanel() {
        super();
        controller = new VolumeSliderController(0, 250, 0);

        initialize();
        setVisible(true);
    }

    private void initialize() {
        setLayout(new GridLayout(1, 1));
        setBorder(BorderFactory.createTitledBorder("Slider"));
        add(controller.getVolumeSlider());
    }

    public VolumeSliderController getController() {
        return controller;
    }
}
