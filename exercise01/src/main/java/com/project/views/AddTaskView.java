package com.project.views;

import com.project.controllers.AddTaskController;

import javax.swing.*;
import java.awt.*;

public class AddTaskView extends JPanel {
    private AddTaskController controller;

    public AddTaskView() {
        super();
        controller = new AddTaskController();
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());
        JPanel taskFieldPanel = new JPanel(new BorderLayout());

        taskFieldPanel.add(controller.getTaskField(), BorderLayout.CENTER);
        Dimension preferredSize = taskFieldPanel.getPreferredSize();
        preferredSize.width *= 0.8;
        controller.getTaskField().setPreferredSize(preferredSize);

        add(taskFieldPanel, BorderLayout.CENTER);
        add(controller.getAddTaskButton(), BorderLayout.EAST);
    }



}
