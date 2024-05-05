package com.project.views;

import com.project.controllers.MultiViewController;

import javax.swing.*;
import java.awt.*;

public class MultiViewPanel extends JPanel {
    private final MultiViewController controller;

    public MultiViewPanel(MultiViewController controller) {
        this.controller = controller;
        initialize();
        setVisible(true);
    }

    private void initialize() {
        setLayout(new CardLayout());
        controller.getModel().getSendButton().addActionListener(e ->{
            CardLayout cardLayout = (CardLayout) getLayout();
            cardLayout.next(this);
        });
        add(new TextFieldView(controller));
        add(new ProgressBarPanel(controller));
    }

}
