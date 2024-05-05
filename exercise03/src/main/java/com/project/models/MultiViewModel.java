package com.project.models;

import javax.swing.*;

public class MultiViewModel {
    private final JLabel name, phone, age, email;
    private final JTextField nameField, phoneField, ageField, emailField;
    private final JButton sendButton;
    private final JTextArea resultTextArea;
    private final JProgressBar progressBar;

    public MultiViewModel() {
        name = new JLabel("Name");
        phone = new JLabel("Phone");
        age = new JLabel("Age");
        email = new JLabel("Email");
        nameField = new JTextField(10);
        phoneField = new JTextField(10);
        ageField = new JTextField(10);
        emailField = new JTextField(10);
        sendButton = new JButton("Send");
        resultTextArea = new JTextArea();
        progressBar = new JProgressBar();
    }

    public JLabel getName() {
        return name;
    }

    public JLabel getPhone() {
        return phone;
    }

    public JLabel getAge() {
        return age;
    }

    public JLabel getEmail() {
        return email;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextField getAgeField() {
        return ageField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JButton getSendButton() {
        return sendButton;
    }

    public JTextArea getResultTextArea() {
        return resultTextArea;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }
}
