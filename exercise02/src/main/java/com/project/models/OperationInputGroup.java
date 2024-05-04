package com.project.models;

import javax.swing.*;

public class OperationInputGroup {
    private final JTextField inputField;
    private final JButton clearButton, additionButton, subtractionButton, multiplicationButton, divisionButton, equalButton;
    private final JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton;

    public OperationInputGroup() {
        inputField = new JTextField();
        clearButton = new JButton("C");
        additionButton = new JButton("+");
        subtractionButton = new JButton("-");
        multiplicationButton = new JButton("x");
        divisionButton = new JButton("/");
        equalButton = new JButton("=");
        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
    }

    public JTextField getInputField() {
        return inputField;
    }

    public String getInput() {
        return inputField.getText();
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getAdditionButton() {
        return additionButton;
    }

    public JButton getSubtractionButton() {
        return subtractionButton;
    }

    public JButton getMultiplicationButton() {
        return multiplicationButton;
    }

    public JButton getDivisionButton() {
        return divisionButton;
    }

    public JButton getEqualButton() {
        return equalButton;
    }

    public JButton getOneButton() {
        return oneButton;
    }

    public JButton getTwoButton() {
        return twoButton;
    }

    public JButton getThreeButton() {
        return threeButton;
    }

    public JButton getFourButton() {
        return fourButton;
    }

    public JButton getFiveButton() {
        return fiveButton;
    }

    public JButton getSixButton() {
        return sixButton;
    }

    public JButton getSevenButton() {
        return sevenButton;
    }

    public JButton getEightButton() {
        return eightButton;
    }

    public JButton getNineButton() {
        return nineButton;
    }

    public JButton getZeroButton() {
        return zeroButton;
    }
}
