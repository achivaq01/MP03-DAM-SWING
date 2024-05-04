package com.project.controllers;

import com.project.models.TaskInputGroup;

import javax.swing.*;

public class AddTaskController {
    private TaskInputGroup taskInputGroup;

    public AddTaskController() {
        taskInputGroup = new TaskInputGroup();
    }

    public JTextField getTaskName() {
        return taskInputGroup.getTaskName();
    }

    public JButton getAddTaskButton() {
        return taskInputGroup.getAddTaskButton();
    }
}
