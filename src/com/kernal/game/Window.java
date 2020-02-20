package com.kernal.game;

import javax.swing.JFrame;

public class Window extends JFrame {

    public Window() {
        setTitle("Realm of the Dead");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1280, 720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

// hhttps://youtu.be/LhUN3EKZiio?t=465