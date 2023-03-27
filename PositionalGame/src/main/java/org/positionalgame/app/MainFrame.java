package org.positionalgame.app;

import javax.swing.*;

import java.awt.*;

import static java.awt.BorderLayout.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;
    GameLogic gameLogic;

    public MainFrame() {
        super("Positional Game");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        controlPanel = new ControlPanel(this);
        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        add(canvas, CENTER);
        add(configPanel, NORTH);
        add(controlPanel, SOUTH);
        canvas.setPreferredSize(new Dimension(400, 400));
        pack();
        gameLogic = new GameLogic(this);
    }
    public void createGame() {
        canvas = new DrawingPanel(this);
        add(canvas, CENTER);
        pack();

        gameLogic = new GameLogic(this);
    }
}

