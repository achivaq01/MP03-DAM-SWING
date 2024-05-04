package com.project.models;

import javax.swing.*;
import java.awt.*;

public class TaskList extends JList<String> {

    public TaskList() {
        super();
        setModel(new DefaultListModel<>());
        addTask("hellohellohellohellohellohellohellohellohello");
        addTask("hello");
        addTask("helhellohellolo");
        addTask("hellhellohellohellohelloo");
        addTask("hellhellohelloo");
        addTask("hello");

    }

    public void addTask(String task) {
        DefaultListModel<String> model = (DefaultListModel<String>) getModel();
        model.addElement(task);
    }

    public void removeTask(int taskIndex) {
        DefaultListModel<String> model = (DefaultListModel<String>) getModel();
        model.remove(taskIndex);
    }
}
