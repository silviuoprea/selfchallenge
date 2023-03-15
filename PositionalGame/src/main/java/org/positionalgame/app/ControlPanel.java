package org.positionalgame.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        setLayout(new GridLayout(1, 4));
        loadBtn.addActionListener(this::loadGame);
        exitBtn.addActionListener(this::exitGame);
        saveBtn.addActionListener(this::saveGame);
        add(saveBtn);
        add(loadBtn);
        add(exitBtn);
    }
    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
    private void loadGame(ActionEvent e) {
    }
    private void saveGame(ActionEvent e) {
    }
}
