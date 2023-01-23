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

public class DonkeyKongGame {
    public static boolean gameRunning;

    /**
     * render method is responsible for drawing all the elements of the game on the screen based on their current state
     */
    public static void render() {

    }

    /**
     * update method is responsible for updating the game state and position of all the elements based on the game logic
     */
    public static void update() {

    }

    public DonkeyKongGame() {
    }

    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        Thread thread = new Thread(() -> gameManager.gameLoop());
        thread.start();
    }
}
