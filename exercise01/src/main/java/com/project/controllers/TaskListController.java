package com.project.controllers;

import com.project.models.TaskList;

public class TaskListController {
    private TaskList taskList;

    public TaskListController() {
        taskList = new TaskList();

    }

    public TaskList getTaskList() {
        return taskList;
    }
}
