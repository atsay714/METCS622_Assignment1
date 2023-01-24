package com.assignment1;

/**
 * Interface for all entities in the game, such as Mario, Donkey Kong, and obstacles
 */
interface Entity {
    /**
     * Method for rendering the entity on the screen
     */
    void render();

    /**
     * Method for updating the entity's state
     */
    void update();
}

/**
 * Interface for the player, which extends the Entity interface
 */
interface Player extends Entity {
    /**
     * Method for moving the player
     */
    void move();

    /**
     * Method for making the player jump
     */
    void jump();
}

/**
 * Interface for obstacles in the game, which extends the Entities interface
 */
interface Obstacle extends Entity {
    /**
     * Method for moving the obstacle
     */
    void move();
}

/**
 * Interface for power-ups in the game, which extends the Entities interface
 */
interface PowerUp extends Entity {
    /**
     * Method for applying the power-up's effect on the player
     */
    void apply();

    /**
     * Method for removing the power-up's effect on the player
     */
    void remove();
}

/**
 * DonkeyKongGame is the main class that sets up and runs the game.
 * It creates an instance of the GameManager class and starts the game loop.
 */
public class DonkeyKongGame {

    public DonkeyKongGame() {
    }

    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        Thread thread = new Thread(() -> gameManager.gameLoop());
        thread.start();
    }
}
