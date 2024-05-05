package com.project;

import com.project.controllers.MultiViewController;
import com.project.views.MultiViewPanel;
import com.project.views.TextFieldView;

import javax.swing.*;

public class MainWindow extends JFrame {
    private MultiViewPanel multiViewPanel;

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        initialize();
        setVisible(true);
    }

    private void initialize() {
        MultiViewController controller = new MultiViewController();
        multiViewPanel = new MultiViewPanel(controller);
        add(multiViewPanel);
    }
}
