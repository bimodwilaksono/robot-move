package com.enigma.repository;

import com.enigma.model.PositionRobot;

public interface PositionRepository {
    PositionRobot getPositions();

    void addPosition(PositionRobot data);

    void changeDirection(String command);

    void move(String command);
}
