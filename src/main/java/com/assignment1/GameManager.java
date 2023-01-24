package com.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * GameManager class is responsible for managing all the game objects,
 * entities, power-ups, and obstacles. It also handles the game loop,
 * input handling, and rendering of the game screen.
 */
public class GameManager {
    private Mario mario;
    private DonkeyKong donkeyKong;
    private PrincessPeach princessPeach;
    private Score score;
    private Lives lives;
    private List<Ladder> ladders;
    private List<Barrel> barrels;
    private List<PowerUp> powerUps;
    private boolean gameRunning;
    private long lastUpdateTime;
    private long currentTime;
    private final int FPS = 60;
    private final long barrelSpawnDelay = 2000; // 2 seconds

    public GameManager() {
        // Initialize game entities
        gameRunning = true;
        mario = new Mario(0, 0);
        System.out.println("Initializing Mario to position: " + mario.getX() + ", " + mario.getY());
        donkeyKong = new DonkeyKong(0, 100);
        System.out.println("Initializing Donkey Kong to position: " + donkeyKong.getX() + ", " + donkeyKong.getY());
        princessPeach = new PrincessPeach(10, 110);
        System.out.println("Initializing Princess Peach to position: " + princessPeach.getX() + ", " + princessPeach.getY());
        score = new Score(0);
        System.out.println("Initializing Score to: " + score.getValue());
        lives = new Lives(3);
        System.out.println("Initializing Lives to: " + lives.getValue());
        ladders = new ArrayList<>();
        System.out.println("Initializing Ladders");
        barrels = new ArrayList<>();
        System.out.println("Initializing Barrels");
        powerUps = new ArrayList<>();
        System.out.println("Initializing Power-Ups");
        
        createEntities();
    }

    public void createEntities() {
        // Create ladders
        ladders.add(new Ladder(50, 50));
        ladders.add(new Ladder(150, 150));
        ladders.add(new Ladder(250, 250));
        
        // Create power-ups
        powerUps.add(new Hammer(10, 10));
        powerUps.add(new Hammer(20, 20));
    }

    public void updateEntities(long elapsedTime) {
        // Update Mario
        mario.update();

        // Update Donkey Kong
        donkeyKong.update();

        // Update barrels
        if(elapsedTime > barrelSpawnDelay)
        {
            barrels.add(new Barrel(10, 100, false));
            System.out.println("Spawn new Barrel");
            lastUpdateTime = currentTime;
        }
        for (Barrel barrel : barrels) {
            barrel.update();
            System.out.println("Updated " + barrel + " position: (" + barrel.getX() + ", " + barrel.getY() + ")");
        }
        System.out.println("Number of barrels: " + barrels.size());
    }

    public void renderEntities() {

        // Render Mario
        mario.render();
        System.out.println("Render Mario");

        // Render Donkey Kong
        donkeyKong.render();
        System.out.println("Render Donkey Kong");

        for (Barrel barrel : barrels) {
            barrel.render();
            System.out.println("Render barrel: " + barrel);
        }
    }

    private void handleInput() {

    }

    public void gameLoop() {
        lastUpdateTime = System.currentTimeMillis();
        while (gameRunning) {
            currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - lastUpdateTime;

            updateEntities(elapsedTime);
            renderEntities();
            handleInput();

            try {
                Thread.sleep(1000/FPS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}