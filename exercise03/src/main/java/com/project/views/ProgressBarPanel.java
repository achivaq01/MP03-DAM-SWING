package com.project.views;

import com.project.controllers.MultiViewController;

import javax.swing.*;

public class ProgressBarPanel extends JPanel {
    private MultiViewController controller;

    public ProgressBarPanel(MultiViewController controller) {
        super();
        this.controller = controller;
        initialize();
        setVisible(true);
    }

    private void initialize() {
        JProgressBar progressBar = controller.getModel().getProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);
        add(progressBar);
    }
}
