package com.project.controllers;

import com.project.models.RemoveTaskButton;

public class RemoveTaskController {
    RemoveTaskButton removeButton;

    public RemoveTaskController() {
        removeButton = new RemoveTaskButton();
    }

    public RemoveTaskButton getRemoveButton() {
        return removeButton;
    }
}
