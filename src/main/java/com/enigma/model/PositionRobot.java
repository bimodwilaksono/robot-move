package com.enigma.model;

import com.enigma.enumeration.Compass;

public class PositionRobot {
    private int x;
    private int y;
    private Compass initialDirection;

    public int getOrdinal() {
        return this.initialDirection.ordinal();
    }

    public PositionRobot(String initialDirection, int x, int y) {
        this.initialDirection = Compass.valueOf(initialDirection);
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

    public Compass getInitialDirection() {
        return initialDirection;
    }

    public void setInitialDirection(Compass initialDirection) {
        this.initialDirection = initialDirection;
    }

    @Override
    public String toString() {
        return "PositionImpl{" +
                "x=" + x +
                ", y=" + y +
                ", initialDirection=" + initialDirection +
                '}';
    }
}
