package failed.views;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicInteger;

import failed.controllers.InfoController;
import failed.controllers.RadioButtonController;
import failed.models.RadioButton;

public class ButtonPanel extends JPanel implements Observer {
    private final RadioButtonController radioButtonController;
    private final ButtonGroup buttonGroup;

    public ButtonPanel(RadioButtonController radioButtonController) {
        super();
        this.radioButtonController = radioButtonController;
        this.buttonGroup = new ButtonGroup();

        initialize();
    }

    private void initialize() {
        initializeLayout();
        SwingUtilities.invokeLater(this::initializeButtons);
        this.setVisible(true);
    }

    private void initializeLayout() {
        int buttonCount = radioButtonController.getRadioButtonCount();
        setLayout(new GridLayout(1, buttonCount));
    }

    private void initializeButtons() {
        int buttonCount = radioButtonController.getRadioButtonCount();
        for (int i = 0; i < buttonCount; i++) {
            initializeButton(i);
        }
    }

    private void initializeButton(int buttonIndex) {
        RadioButton button = radioButtonController.getRadioButton(buttonIndex);
        JRadioButton jRadioButton = new JRadioButton(button.getLabel());
        jRadioButton.setSelected(button.getSelected());

        jRadioButton.addActionListener(e -> {
            radioButtonController.selectRadioButton(buttonIndex);
            updateButtons();
        });


        buttonGroup.add(jRadioButton);
        add(jRadioButton);
    }

    private void updateButtons() {
        int selectedButtonIndex = radioButtonController.getSelectedRadioButtonIndex();
        AtomicInteger index = new AtomicInteger();
        buttonGroup.getElements().asIterator().forEachRemaining(abstractButton -> {
            abstractButton.setSelected(index.get() == selectedButtonIndex);
            index.getAndIncrement();

        });
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof InfoController) {
            // Update the button panel
            updateButtons();
        }
    }
}
