package failed.views;

import failed.controllers.TextFieldController;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {

    private final TextFieldController textFieldController;

    public TextFieldPanel(TextFieldController textFieldController) {
        super();
        this.textFieldController = textFieldController;
        initialize();
    }

    private void initialize() {
        initializeLayout();
        this.setBorder(BorderFactory.createTitledBorder("Text"));
        SwingUtilities.invokeLater(this::initializeJTextField);
        this.setVisible(true);
    }

    private void initializeLayout() {
        setLayout(new GridLayout(1, 1));
    }

    private void initializeJTextField() {
         JTextField textField = new JTextField();
         textField.setText(textFieldController.getTextFieldText());
         textField.setEditable(true);
         textField.addActionListener(e -> {
             textFieldController.setTextFieldText(textField.getText());
         });

         add(textField);
    }



}
