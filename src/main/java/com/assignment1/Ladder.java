package com.assignment1;

public class Ladder implements Entity {
    
    private int x;

    private int y;

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

    public Ladder(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
    
}