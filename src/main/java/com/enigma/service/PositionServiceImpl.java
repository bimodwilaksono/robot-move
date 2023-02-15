package com.enigma.service;

import com.enigma.model.PositionRobot;
import com.enigma.repository.PositionRepository;

public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public PositionRobot getPosition() {
        return this.positionRepository.getPositions();
    }

    @Override
    public void registerPosition(PositionRobot position) {
        this.positionRepository.addPosition(position);
    }

    @Override
    public void moveRobot(String com) {
        String[] comArr = com.split("");
        for (String s : comArr) {
            if (s.equals("A")) {
                this.positionRepository.move(s);
            } else {
                changeDirectionRobot(s);
            }
            System.out.println(s + " -> " + "(" + this.getPosition().getX() + ", " + this.getPosition().getY() + ")");
        }
    }

    public void changeDirectionRobot(String com) {
        this.positionRepository.changeDirection(com);
    }
}
