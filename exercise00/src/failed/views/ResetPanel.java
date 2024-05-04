package failed.views;

import failed.controllers.InfoController;

import javax.swing.*;
import java.awt.*;

public class ResetPanel extends JPanel {
    private InfoController infoController;
    private JButton resetButton;

    public ResetPanel(InfoController infoController) {
        super();
        this.infoController = infoController;
        initialize();
    }

    private void initialize() {
        initializeLayout();
        this.setBorder(BorderFactory.createTitledBorder("reset"));
        SwingUtilities.invokeLater(this::initializeResetButton);
        this.setVisible(true);
    }

    private void initializeLayout() {
        this.setLayout(new GridLayout(1, 1));
    }

    private void initializeResetButton() {
        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            infoController.resetValues();
        });
        add(resetButton);
    }
}
