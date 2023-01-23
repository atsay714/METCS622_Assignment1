package com.assignment1;

/**
 * Lives class responsible for keeping track of the player's lives
 */
public class Lives {
    private int value;

    public Lives(int i) {
        this.value = i;
    }

    /**
     * Getter for the lives value
     * @return int lives value
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter for the lives value
     * @param value int lives value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Method that decrements the lives value
     */
    public void decrementValue() {
        this.value--;
    }
}