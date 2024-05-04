package com.project.controllers;

import com.project.models.TextField;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import static com.project.controllers.ResetController.updateLabelPart;

public class TextFieldController {
    private TextField textField;

    public TextFieldController() {
        textField = new TextField();
        initializeTextField();
    }

    private void initializeTextField() {
        textField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabelPart(2, "Text " + textField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabelPart(2, "Text " + textField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabelPart(2, "Text " + textField.getText());
            }
        });
    }

    public void updateTextField(String text) {
        textField.setText(text);
    }

    public TextField getTextField() {
        return textField;
    }
}
