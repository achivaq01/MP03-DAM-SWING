package com.project.views;

import com.project.controllers.MultiViewController;
import com.project.models.MultiViewModel;

import javax.swing.*;
import java.awt.*;

public class TextFieldView extends JPanel {
    private final MultiViewController controller;

    public TextFieldView(MultiViewController controller) {
        super();
        this.controller = controller;
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        MultiViewModel model = controller.getModel();

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel.add(model.getName());
        namePanel.add(model.getNameField());

        JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        agePanel.add(model.getAge());
        agePanel.add(model.getAgeField());

        JPanel phonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        phonePanel.add(model.getPhone());
        phonePanel.add(model.getPhoneField());

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        emailPanel.add(model.getEmail());
        emailPanel.add(model.getEmailField());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(model.getSendButton());

        add(namePanel);
        add(agePanel);
        add(phonePanel);
        add(emailPanel);
        add(buttonPanel);
    }
}
