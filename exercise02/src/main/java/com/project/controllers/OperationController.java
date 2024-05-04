package com.project.controllers;

import com.project.models.OperationInputGroup;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class OperationController {
    private static final List<Character> operators = List.of(
            '+',    // Addition
            '-',    // Subtraction
            'x',    // Multiplication
            '/'     // Division
    );

    private final OperationInputGroup inputGroup;

    public OperationController() {
        inputGroup = new OperationInputGroup();
    }

    public OperationInputGroup getInputGroup() {
        return inputGroup;
    }

    public void addInput(String input) {
        JTextField inputField = inputGroup.getInputField();
        inputField.setText(inputField.getText() + input);
    }

    public void clearInput() {
        inputGroup.getInputField().setText("");
    }

    public String calculate() {
        String result = "";
        List<Character> operationCharacters = getOperationCharacters(inputGroup.getInput());
        if (allCharactersValid(operationCharacters)) {
            List<Character> foundOperators = getOperators(operationCharacters);
            removeSpaces(operationCharacters);
            List<String> values = getValues(operationCharacters);

            if (isValidOperation(values, foundOperators)) {
                result = String.valueOf(evaluateOperation(values, foundOperators));
            }

        }
        if (!result.isBlank()) {
            result = result.replace(result.substring(result.indexOf('.')), "");
        }
        return result;
    }

    private List<Character> getOperators(List<Character> operationCharacters) {
        List<Character> foundOperators = new ArrayList<>();
        for (Character character : operationCharacters) {
            if (operators.contains(character)) {
                foundOperators.add(character);
            }
        }
        return foundOperators;
    }

    private List<Character> getOperationCharacters(String operation) {
        List<Character> operationCharacters = new ArrayList<>();
        for (Character character : operation.toCharArray()) {
            operationCharacters.add(character);
        }
        return operationCharacters;
    }

    private boolean allCharactersValid(List<Character> characters) {
        boolean isValid = true;
        for (Character character : characters) {
            if (!Character.isDigit(character) && !operators.contains(character) && !Character.isSpaceChar(character)) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private void removeSpaces(List<Character> characters) {
        characters.removeAll(List.of(' '));
    }

    private List<String> getValues(List<Character> characters) {
        List<String> values = new ArrayList<>();
        StringBuilder value = new StringBuilder();

        for (Character character : characters) {
            if (Character.isDigit(character)) {
                value.append(character);
            } else {
                if (!value.isEmpty()) {
                    values.add(value.toString());
                }
                value = new StringBuilder();
            }
        }
        if (!value.isEmpty()) {
            values.add(value.toString());
        }
        return values;
    }

    private boolean isValidOperation(List<String> values, List<Character> operators) {
        return operators.size() == values.size() - 1;
    }

    private double evaluateOperation(List<String> values, List<Character> operators) {
        double result = 0d;

        for (int i = 0; i < operators.size(); i++) {
            Character operator = operators.get(i);
            String firstValue;
            String secondValue;

            if (i == 0) {
                firstValue = values.get(i);
            } else {
                firstValue = String.valueOf(result);
            }
            secondValue = values.get(i + 1);

            switch (operator) {
                case '+' -> result = evaluateAggregation(firstValue, secondValue);
                case '-' -> result = evaluateSubtraction(firstValue, secondValue);
                case 'x' -> result = evaluateMultiplication(firstValue, secondValue);
                case '/' -> result = evaluateDivision(firstValue, secondValue);
            }
        }

        return result;
    }

    private double evaluateAggregation(String firstValue, String secondValue) {
        return Double.parseDouble(firstValue) + Double.parseDouble(secondValue);
    }

    private double evaluateSubtraction(String firstValue, String secondValue) {
        return Double.parseDouble(firstValue) - Double.parseDouble(secondValue);
    }

    private double evaluateMultiplication(String firstValue, String secondValue) {
        return Double.parseDouble(firstValue) * Double.parseDouble(secondValue);
    }

    private double evaluateDivision(String firstValue, String secondValue) {
        return Double.parseDouble(firstValue) / Double.parseDouble(secondValue);
    }

}
