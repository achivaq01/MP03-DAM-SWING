package com.project.views;

import com.project.controllers.TaskListController;

import javax.swing.*;
import java.awt.*;

public class TaskListPanel extends JPanel {
    TaskListController controller;

    public TaskListPanel(TaskListController controller) {
        this.controller = controller;
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(controller.getTaskList());
        add(scrollPane, BorderLayout.CENTER);
    }
}
