package failed.views;

import failed.controllers.VolumeSliderController;
import failed.models.VolumeSlider;

import javax.swing.*;
import java.awt.*;

public class SliderPanel extends JPanel {
    private final VolumeSliderController volumeSliderController;

    public SliderPanel(VolumeSliderController volumeSliderController) {
        super();
        this.volumeSliderController = volumeSliderController;
        initialize();
    }

    private void initialize() {
        initializeLayout();
        SwingUtilities.invokeLater(this::initializeSlider);
        this.setVisible(true);
    }

    private void initializeLayout() {
        setLayout(new GridLayout(1, 1));
    }

    private void initializeSlider() {
        VolumeSlider volumeSlider = volumeSliderController.getVolumeSlider();
        JSlider slider = new JSlider(volumeSlider.getMinValue(), volumeSlider.getMaxValue(), volumeSlider.getValue());
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.addChangeListener(e -> volumeSlider.setValue(slider.getValue()));

        add(slider);
    }
}
