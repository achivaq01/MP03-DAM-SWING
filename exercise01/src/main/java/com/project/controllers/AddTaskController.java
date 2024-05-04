package com.project.controllers;

import com.project.models.AddTaskButton;
import com.project.models.TaskField;

public class AddTaskController {
    private TaskField taskField;
    private AddTaskButton addTaskButton;

    public AddTaskController() {
        taskField = new TaskField();
        addTaskButton = new AddTaskButton();
    }

    public TaskField getTaskField() {
        return taskField;
    }

    public AddTaskButton getAddTaskButton() {
        return addTaskButton;
    }
}
