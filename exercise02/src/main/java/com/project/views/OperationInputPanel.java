package com.project.views;

import com.project.controllers.OperationController;
import com.project.models.OperationInputGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class OperationInputPanel extends JPanel {
    private final OperationController controller;

    public OperationInputPanel(OperationController operationController) {
        super();
        this.controller = operationController;
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());
        initializeMenu();
        initializeInputField();
        initializeButtons();
    }

    private void initializeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem exitItem = new JMenuItem("Exit");

        clearItem.addActionListener(e -> controller.clearInput());
        exitItem.addActionListener(e -> System.exit(0));

        menu.add(clearItem);
        menu.add(exitItem);
        menuBar.add(menu);
        this.add(menuBar, BorderLayout.NORTH);

    }

    private void initializeInputField() {
        JTextField inputField = controller.getInputGroup().getInputField();
        inputField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputField.setText(controller.calculate());
                }
            }

        });
        add(inputField, BorderLayout.CENTER);
    }

    private void initializeButtons() {
        List<JButton> westButtons = initializeWestButtons();
        List<JButton> centerButtons = initializeCenterButtons();
        List<JButton> eastButtons = initializeEastButtons();
        JPanel buttonPanel = new JPanel(new BorderLayout());

        JPanel westPanel = new JPanel(new GridLayout(westButtons.size(), 1));
        westButtons.forEach(westPanel::add);
        buttonPanel.add(westPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel(new GridLayout(3, 2));
        centerButtons.forEach(centerPanel::add);
        buttonPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel eastPanel = new JPanel(new GridLayout(eastButtons.size(), 1));
        eastButtons.forEach(eastPanel::add);
        buttonPanel.add(eastPanel, BorderLayout.EAST);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private List<JButton> initializeWestButtons() {
        List<JButton> westButtons = new ArrayList<>();
        OperationInputGroup inputGroup = controller.getInputGroup();

        JButton button = inputGroup.getClearButton();
        button.addActionListener(e -> controller.clearInput());
        westButtons.add(button);

        button = inputGroup.getSevenButton();
        button.addActionListener(e -> controller.addInput("7"));
        westButtons.add(button);

        button = inputGroup.getFourButton();
        button.addActionListener(e -> controller.addInput("4"));
        westButtons.add(button);

        button = inputGroup.getOneButton();
        button.addActionListener(e -> controller.addInput("1"));
        westButtons.add(button);

        button = inputGroup.getZeroButton();
        button.addActionListener(e -> controller.addInput("0"));
        westButtons.add(button);

        return westButtons;
    }

    public List<JButton> initializeCenterButtons() {
        List<JButton> centerButtons = new ArrayList<>();
        OperationInputGroup inputGroup = controller.getInputGroup();

        JButton button = inputGroup.getEightButton();
        button.addActionListener(e -> controller.addInput("8"));
        centerButtons.add(button);

        button = inputGroup.getFiveButton();
        button.addActionListener(e -> controller.addInput("5"));
        centerButtons.add(button);

        button = inputGroup.getTwoButton();
        button.addActionListener(e -> controller.addInput("2"));
        centerButtons.add(button);

        button = inputGroup.getNineButton();
        button.addActionListener(e -> controller.addInput("9"));
        centerButtons.add(button);

        button = inputGroup.getSixButton();
        button.addActionListener(e -> controller.addInput("6"));
        centerButtons.add(button);

        button = inputGroup.getThreeButton();
        button.addActionListener(e -> controller.addInput("3"));
        centerButtons.add(button);

        return centerButtons;
    }

    private List<JButton> initializeEastButtons() {
        List<JButton> eastButtons = new ArrayList<>();
        OperationInputGroup inputGroup = controller.getInputGroup();

        JButton button = inputGroup.getAdditionButton();
        button.addActionListener(e -> controller.addInput("+"));
        eastButtons.add(button);

        button = inputGroup.getSubtractionButton();
        button.addActionListener(e -> controller.addInput("-"));
        eastButtons.add(button);

        button = inputGroup.getMultiplicationButton();
        button.addActionListener(e -> controller.addInput("x"));
        eastButtons.add(button);

        button = inputGroup.getDivisionButton();
        button.addActionListener(e -> controller.addInput("/"));
        eastButtons.add(button);

        button = inputGroup.getEqualButton();
        button.addActionListener(e -> {
            JTextField inputField = controller.getInputGroup().getInputField();
            inputField.setText(controller.calculate());
        });
        eastButtons.add(button);

        return eastButtons;
    }
}
