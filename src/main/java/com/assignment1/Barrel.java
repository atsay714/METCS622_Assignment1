package com.assignment1;

public class Barrel implements Obstacle {
    
    private int x;

    private int y;

    private boolean isBlue;

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean isBlue) {
        this.isBlue = isBlue;
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

    public Barrel() {
    }

    public Barrel(int x, int y, boolean isBlue) {
        this.x = x;
        this.y = y;
        this.isBlue = isBlue;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update() {
        this.x = this.x + 1;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

}