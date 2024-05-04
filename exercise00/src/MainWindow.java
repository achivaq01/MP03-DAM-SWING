import models.RadioButton;
import views.RadioButtonPanel;
import views.ResetPanel;
import views.TextFieldPanel;
import views.VolumeSliderPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(4, 1));

        RadioButtonPanel buttonPanel = new RadioButtonPanel(List.of(
                new RadioButton("option 1"),
                new RadioButton("option 2"),
                new RadioButton("option 3")
        ));
        VolumeSliderPanel sliderPanel = new VolumeSliderPanel();
        TextFieldPanel fieldPanel = new TextFieldPanel();
        ResetPanel resetPanel = new ResetPanel(buttonPanel.getController(), sliderPanel.getController(), fieldPanel.getController());


        this.add(buttonPanel);
        this.add(sliderPanel);
        this.add(fieldPanel);
        this.add(resetPanel);
        this.setTitle("Exercise 00");
        this.setVisible(true);
    }
}
