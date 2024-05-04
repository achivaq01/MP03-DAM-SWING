import failed.controllers.InfoController;
import failed.controllers.RadioButtonController;
import failed.controllers.TextFieldController;
import failed.controllers.VolumeSliderController;
import failed.models.RadioButton;
import failed.models.TextField;
import failed.models.VolumeSlider;
import failed.views.ButtonPanel;
import failed.views.ResetPanel;
import failed.views.SliderPanel;
import failed.views.TextFieldPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        new MainWindow();
    }
}
