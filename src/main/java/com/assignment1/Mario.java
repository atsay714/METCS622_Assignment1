package com.assignment1;

/**
 * The Mario class represents the player character in the game. It implements the Player interface and provides
 * methods for rendering, updating, moving, and jumping.
 */
public class Mario implements Player {
    /**
     * The x-coordinate of Mario's current position
     */
    private int x;

    /**
     * The y-coordinate of Mario's current position
     */
    private int y;

    /**
     * The change in x-coordinate per frame
     */
    private int dx;

    /**
     * The change in y-coordinate per frame
     */
    private int dy;

    /**
     * The speed of Mario's movement
     */
    private int velocity;

    /**
     * Default constructor, starts Mario at game start position
     */
    public Mario() {
    }

    /**
     * Constructor that allows starting Mario at a different location
     * @param x the x-coordinate of the starting position
     * @param y the y-coordinate of the starting position
     */
    public Mario(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for the y-coordinate of Mario's current position
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for the y-coordinate of Mario's current position
     * @param x the y-coordinate to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter for the x-coordinate of Mario's current position
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for the x-coordinate of Mario's current position
     * @param x the x-coordinate to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for the change in y-coordinate per frame
     * @return the dy value
     */
    public int getDy() {
        return dy;
    }

    /**
     * Setter for the change in y-coordinate per frame
     * @param dy the dy value to set
     */
    public void setDy(int dy) {
        this.dy = dy;
    }

    /**
     * Getter for the change in x-coordinate per frame
     * @return the dx value
     */
    public int getDx() {
        return dx;
    }

    /**
     * Setter for the change in x-coordinate per frame
     * @param dx the dx value to set
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * Getter for the speed of Mario's movement
     * @return the velocity value
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * Setter for the speed of Mario's movement
     * @param velocity the velocity value to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * render method is responsible for drawing the player on the screen based on its current position,
     * this method is called in the render loop of the game.
     */
    @Override
    public void render() {
        // TODO Auto-generated method stub
        
    }

    /**
     * update method is responsible for updating the player's position and state based on the game logic,
     * this method is called in the update loop of the game.
     */
    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    /**
     * move method is responsible for moving the player based on the current dx, dy and velocity, 
     * this method is called in the update loop of the game.
     */
    @Override
    public void move() {
        // TODO Auto-generated method stub
    }

    /**
     * jump method is responsible for making the player jump, 
     * this method is called when the player press the jump button.
     */
    @Override
    public void jump() {
        // TODO Auto-generated method stub
        
    }

}