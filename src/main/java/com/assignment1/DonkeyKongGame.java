package com.assignment1;

interface Entity{
    void render();
    void update();
}

interface Player extends Entity {
    void move();
    void jump();
}

interface Obstacle extends Entity {
    void move();
}

interface PowerUp extends Entity {
    void apply();
    void remove();
}

public class DonkeyKongGame {
    /**
     * render method is responsible for drawing all the elements of the game on the screen based on their current state
     */
    public void render() {

    }

    /**
     * update method is responsible for updating the game state and position of all the elements based on the game logic
     */
    public void update() {

    }

    private DonkeyKongGame() {
    }
    
    public static void main(String[] args) {
        
    }
}
