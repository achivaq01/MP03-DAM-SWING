package com.project.views;

import com.project.controllers.MultiViewController;
import com.project.models.MultiViewModel;

import javax.swing.*;

public class TextAreaView extends JPanel {
    private final MultiViewController controller;

    public TextAreaView(MultiViewController controller) {
        super();
        this.controller = controller;
        initialize();
        setVisible(true);
    }

    private void initialize() {
        MultiViewModel model = controller.getModel();
        String name = model.getNameValue();
        String email = model.getEmailValue();
        String age = model.getAgeValue();
        String phone = model.getPhoneValue();

        JTextArea textArea = new JTextArea();
        textArea.append("Name: " + name + "\nEmail: " + email + "\nAge: " + age + "\nPhone: " + phone);
        textArea.setEditable(false);
        add(textArea);
    }


}
