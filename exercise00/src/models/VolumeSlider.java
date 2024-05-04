package models;

import javax.swing.*;

public class VolumeSlider extends JSlider {

    public VolumeSlider(int min, int max, int value) {
        super(JSlider.HORIZONTAL, min, max, value);
    }

}
