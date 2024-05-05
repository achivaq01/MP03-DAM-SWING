package com.project.controllers;

import com.project.models.MultiViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MultiViewController {
    private MultiViewModel model;

    public MultiViewController() {
        model = new MultiViewModel();
        initializeModel();
        initializeSendButton();
    }

    private void initializeModel() {
        model = new MultiViewModel();

    }

    private void initializeSendButton() {
        JButton sendButton = model.getSendButton();
        sendButton.addActionListener(e -> {
            sendData();
        });
    }

    private boolean allFieldsFilled() {
        List<JTextField> fields = List.of(
                model.getAgeField(),
                model.getEmailField(),
                model.getNameField(),
                model.getPhoneField()
        );
        return fields.stream().noneMatch(field -> field.getText().isBlank());
    }

    private void sendData() {
        if (allFieldsFilled()) {
            initializeTimer();
        }
    }

    private void initializeTimer() {
        Timer timer = new Timer(150, new ActionListener() {
            private int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {

                addProgressBarValue();
                if (count * 150 >= 2500) {
                    ((Timer) e.getSource()).stop();
                }

                count++;
            }
        });
        timer.start();
    }

    private void addProgressBarValue() {
        JProgressBar progressBar = model.getProgressBar();
        progressBar.setValue(progressBar.getValue() + 17);
    }

    public MultiViewModel getModel() {
        return model;
    }
}
