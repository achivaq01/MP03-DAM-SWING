package com.project.models;

import javax.swing.*;

public class TaskInputGroup {
    private JTextField taskName;
    private JButton addTaskButton;

    public TaskInputGroup() {
        taskName = new JTextField();
        addTaskButton = new JButton("Add Task");
    }

    public JTextField getTaskName() {
        return taskName;
    }

    public JButton getAddTaskButton() {
        return addTaskButton;
    }
}
