package com.project.views;

import com.project.controllers.MultiViewController;
import com.project.models.MultiViewModel;

import javax.swing.*;
import java.awt.*;

public class MultiViewPanel extends JPanel {
    private final MultiViewController controller;
    private final CardLayout layout;

    public MultiViewPanel(MultiViewController controller) {
        this.controller = controller;
        layout = new CardLayout();
        initialize();
        setVisible(true);
    }

    private void initialize() {
        setLayout(layout);
        controller.getModel().getSendButton().addActionListener(e ->{
            storeValues();
            CardLayout cardLayout = getLayout();
            cardLayout.next(this);
        });
        add(new TextFieldView(controller));
        add(new ProgressBarPanel(controller));
    }

    public CardLayout getLayout() {
        return layout;
    }

    private void storeValues() {
        MultiViewModel model = controller.getModel();
        model.setNameValue(model.getNameField().getText());
        model.setAgeValue(model.getAgeField().getText());
        model.setEmailValue(model.getEmailField().getText());
        model.setPhoneValue(model.getPhoneField().getText());
        System.out.println("Stored values: \n" + model.getNameValue() + "\n" + model.getAgeValue() + "\n" + model.getEmailValue() + "\n" + model.getPhoneValue());
    }

}
