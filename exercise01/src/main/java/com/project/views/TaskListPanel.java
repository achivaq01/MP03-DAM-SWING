package com.project.views;

import com.project.controllers.TaskListController;

import javax.swing.*;

public class TaskListPanel extends JPanel {
    TaskListController controller;

    public TaskListPanel() {
        controller = new TaskListController();
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        add(controller.getTaskList());
    }
}
