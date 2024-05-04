package com.project.views;

import com.project.controllers.RemoveTaskController;

import javax.swing.*;

public class RemoveTaskPanel extends JPanel {
    RemoveTaskController controller;

    public RemoveTaskPanel(RemoveTaskController controller) {
        super();
        this.controller = controller;
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        add(controller.getRemoveButton());
    }

}
