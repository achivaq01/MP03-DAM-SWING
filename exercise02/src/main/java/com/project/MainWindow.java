package com.project;

import com.project.controllers.OperationController;
import com.project.views.OperationInputPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
        setSize(500, 500);
        setVisible(true);
    }

    public void initialize() {
        setLayout(new BorderLayout());
        add(new OperationInputPanel(new OperationController()));
    }
}
