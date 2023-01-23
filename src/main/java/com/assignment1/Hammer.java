package com.assignment1;

/**
 * The Hammer class represents a power-up in the game that gives the player the ability to break certain obstacles. 
 * it implements the PowerUp interface and provides methods for rendering, updating, applying, and removing the power-up.
 */
public class Hammer implements PowerUp{
    /**
     * The x-coordinate of the Hammer's current position
     */
    private int x;

    /**
     * The y-coordinate of the Hammer's current position
     */
    private int y;

    /**
     * A boolean value that indicates whether the Hammer has been consumed by the player or not
     */
    private boolean isConsumed;

    public Hammer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for the consumed status of the Hammer
     * @return true if the Hammer has been consumed, false otherwise
     */
    public boolean isConsumed() {
        return isConsumed;
    }

    /**
     * Setter for the consumed status of the Hammer
     * @param isConsumed the consumed status to set
     */
    public void setConsumed(boolean isConsumed) {
        this.isConsumed = isConsumed;
    }

    /**
     * Getter for the y-coordinate of the Hammer's current position
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for the y-coordinate of the Hammer's current position
     * @param y the y-coordinate to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter for the x-coordinate of the Hammer's current position
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for the x-coordinate of the Hammer's current position
     * @param x the x-coordinate to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * render method is responsible for drawing the Hammer on the screen based on its current position,
     * this method is called in the render loop of the game.
     */
    @Override
    public void render() {
        // TODO Auto-generated method stub
        
    }

    /**
     * update method is responsible for updating the Hammer's position and state based on the game logic,
     * this method is called in the update loop of the game.
     */
    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    /**
     * apply method is responsible for applying the Hammer power-up to the player,
     * this method is called when the player collects the Hammer power-up.
     */
    @Override
    public void apply() {
        // TODO Auto-generated method stub
        
    }

    /**
     * remove method is responsible for removing the Hammer power-up from the player,
     * this method is called when the Hammer power-up is consumed or its duration has expired.
     */
    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }
    
}