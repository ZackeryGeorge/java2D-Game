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

// https://youtu.be/hM4pN7hAsgg?list=PLvJM9qNXoUYUDaDo_yfSKgn5dYnMmdN8B&t=684