package org.positionalgame.app;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JButton set = new JButton("Set");
    JSpinner spinner;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        label = new JLabel("Grid size:");
        spinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        add(label);
        add(spinner);
        add(set);
        set.addActionListener(this::setNewGame);
    }
    private void setNewGame(ActionEvent actionEvent) {
        frame.remove(frame.canvas);
        frame.createGame();
    }
    public int getRows() {
        return (int) spinner.getValue();
    }
    public int getCols() {
        return (int) spinner.getValue();
    }
}

