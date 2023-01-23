package com.assignment1;

/**
 * Score class responsible for keeping track of the player's score
 */
public class Score {
    private int value;

    public Score(int value) {
        this.value = value;
    }

    /**
     * Getter for the score value
     * @return int score value
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter for the score value
     * @param value int score value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Method that increments the score value
     * @param value int increment value
     */
    public void incrementValue(int value) {
        this.value += value;
    }
}