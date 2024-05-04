package failed.controllers;

import failed.models.TextField;

public class TextFieldController {
    TextField textField;

    public TextFieldController(TextField textField) {
        this.textField = textField;
    }

    public String getTextFieldText() {
        return textField.getText();
    }

    public void setTextFieldText(String textFieldText) {
        textField.setText(textFieldText);
    }

    public void clearTextFieldText() {
        textField.setText("");
    }

}
