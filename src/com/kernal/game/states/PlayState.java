package com.kernal.game.states;

import com.kernal.game.util.KeyHandler;
import com.kernal.game.util.MouseHandler;

import java.awt.Graphics2D;
import java.awt.Color;

public class PlayState extends GameState {

    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update() {

    }

    public void input(MouseHandler mouse, KeyHandler key) {
        if (key.up.down) {
            System.out.println("Moving down!");
        }
    }

    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 64, 64);
    }

}
