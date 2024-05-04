package com.project.controllers;

import com.project.models.TaskInputGroup;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddTaskController {
    private TaskInputGroup taskInputGroup;
    private TaskListController taskListController;

    public AddTaskController(TaskListController taskListController) {
        taskInputGroup = new TaskInputGroup();
        this.taskListController = taskListController;
        initializeTaskInputGroup();
    }

    private void initializeTaskInputGroup() {
        initializeAddTaskButton();
        initializeAddTaskName();
    }

    private void initializeAddTaskButton() {
        JButton addTaskButton = taskInputGroup.getAddTaskButton();
        addTaskButton.addActionListener(e -> addTask());
    }

    private void initializeAddTaskName() {
        JTextField taskName = taskInputGroup.getTaskName();
        taskName.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask();
                }
            }

        });
    }

    private void addTask() {
        String taskName = taskInputGroup.getTaskName().getText();
        if (!taskName.isBlank()) {
            taskListController.getTaskList().addTask(taskName);
        }
    }

    public JTextField getTaskName() {
        return taskInputGroup.getTaskName();
    }

    public JButton getAddTaskButton() {
        return taskInputGroup.getAddTaskButton();
    }
}
