package com.assignment1;

import java.util.ArrayList;
import java.util.List;

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
    }

    public void createEntities() {
        // Create obstacles
        ladders.add(new Ladder(50, 50));
        ladders.add(new Ladder(150, 150));
        ladders.add(new Ladder(250, 250));
        
        // Create power-ups
        powerUps.add(new Hammer(10, 10));
        powerUps.add(new Hammer(20, 20));
    }

    public void updateEntities() {
        // Update Mario
        mario.update();
        System.out.println("Update Mario");

        // Update Donkey Kong
        donkeyKong.update();
        System.out.println("Update Donkey Kong");

        // Update barrels
        barrels.add(new Barrel(10, 100));
        System.out.println("Spawn new Barrel");
        for (Barrel barrel : barrels) {
            barrel.setX(barrel.getX()+20);
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
            System.out.println("Render barrel: " + barrel);
        }
    }

    public void handleInput() {
        // Check for keyboard input
    }

    public void gameLoop() {
        long lastUpdateTime = System.currentTimeMillis();
        while (gameRunning) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - lastUpdateTime;

            if(elapsedTime > barrelSpawnDelay)
            {
                updateEntities();
                renderEntities();
                handleInput();
                lastUpdateTime = currentTime;
            }

            try {
                Thread.sleep(1000/FPS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}