package com.project.controllers;

import com.project.models.RemoveTaskButton;
import com.project.models.TaskList;

public class RemoveTaskController {
    RemoveTaskButton removeButton;
    TaskListController taskListController;

    public RemoveTaskController(TaskListController taskListController) {
        this.taskListController = taskListController;
        removeButton = new RemoveTaskButton();
        initializeRemoveButton();
    }

    private void initializeRemoveButton() {
        removeButton.addActionListener(e -> {
            TaskList taskList = taskListController.getTaskList();
            int taskIndex = taskList.getSelectedIndex();
            taskList.removeTask(taskIndex);
        });
    }

    public RemoveTaskButton getRemoveButton() {
        return removeButton;
    }
}
