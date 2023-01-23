package com.assignment1;

/**
 * PrincessPeach class represents the princess Peach entity in the game.
 */
public class PrincessPeach implements Entity {
    private int x;
    private int y;

    public PrincessPeach(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * render method is responsible for drawing the Princess Peach on the screen based on its current position,
     * this method is called in the render loop of the game.
     */
    @Override
    public void render() {
        // TODO Auto-generated method stub
    }

    /**
     * update method is responsible for updating the Princess Peach position and state based on the game logic,
     * this method is called in the update loop of the game.
     */
    @Override
    public void update() {
        // TODO Auto-generated method stub
    }

}