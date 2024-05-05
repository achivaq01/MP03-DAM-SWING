package com.project.controllers;

import com.project.models.MultiViewModel;
import com.project.views.MultiViewPanel;
import com.project.views.TextAreaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MultiViewController {
    private MultiViewModel model;
    private MultiViewPanel parentPanel;

    public MultiViewController() {
        model = new MultiViewModel();
        initializeModel();
        initializeSendButton();
    }

    public void setParentPanel(MultiViewPanel parentPanel) {
        this.parentPanel = parentPanel;
    }

    public MultiViewPanel getParentPanel() {
        return parentPanel;
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
        MultiViewController controller = this;
        Timer timer = new Timer(150, new ActionListener() {
            private int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {

                addProgressBarValue();
                if (count * 150 >= 2500) {
                    ((Timer) e.getSource()).stop();
                    parentPanel.add(new TextAreaView(controller));
                    parentPanel.getLayout().next(parentPanel);
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
