package com.enigma.service;

import com.enigma.model.PositionRobot;

public interface PositionService {
    void registerPosition(PositionRobot position);
    void moveRobot(String command);
}
