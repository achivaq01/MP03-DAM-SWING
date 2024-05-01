import controllers.RadioButtonController;
import models.RadioButton;
import views.ButtonPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Main {

    public static void main(String[] args) {
        RadioButtonController rb = new RadioButtonController();
        rb.addRadioButton(new RadioButton("Option 1"));
        rb.addRadioButton(new RadioButton("Option 2"));
        rb.addRadioButton(new RadioButton("Option 3"));

        ButtonPanel buttonPanel = new ButtonPanel(rb);
        JFrame frame = new JFrame("Exercise 0");

        TitledBorder titledBorder = BorderFactory.createTitledBorder("Select an option:");
        buttonPanel.setBorder(titledBorder);
        frame.add(buttonPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
