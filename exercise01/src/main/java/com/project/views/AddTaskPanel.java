package com.project.views;

import com.project.controllers.AddTaskController;

import javax.swing.*;
import java.awt.*;

public class AddTaskPanel extends JPanel {
    private final AddTaskController controller;

    public AddTaskPanel() {
        super();
        controller = new AddTaskController();
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());
        JPanel taskFieldPanel = new JPanel(new BorderLayout());

        taskFieldPanel.add(controller.getTaskName(), BorderLayout.CENTER);
        Dimension preferredSize = taskFieldPanel.getPreferredSize();
        preferredSize.width *= 0.8;
        controller.getTaskName().setPreferredSize(preferredSize);

        add(taskFieldPanel, BorderLayout.CENTER);
        add(controller.getAddTaskButton(), BorderLayout.EAST);
    }



}
