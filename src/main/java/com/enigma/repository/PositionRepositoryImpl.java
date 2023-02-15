package com.enigma.repository;

import com.enigma.enumeration.Compass;
import com.enigma.model.PositionRobot;

public class PositionRepositoryImpl implements PositionRepository {
    private PositionRobot[] positions = new PositionRobot[1];

    @Override
    public void addPosition(PositionRobot position) {
        int n = this.positions.length;
        for (int i = 0; i < n; i++) {
            this.positions[i] = position;
        }
    }

    @Override
    public void changeDirection(String a) {
        int ordinal = this.getPositions().getOrdinal();
        if (a.equals("L")) {
            this.getPositions().setInitialDirection(Compass.getCompass(ordinal + 1));
        }
        if (a.equals("R")) {
            this.getPositions().setInitialDirection(Compass.getCompass(ordinal - 1));
        }
    }

    @Override
    public void move(String s) {
        int x = this.getPositions().getX();
        int y = this.getPositions().getY();
        int ordinal = this.getPositions().getOrdinal();

        switch (ordinal) {
            case 0 -> getPositions().setX(x + 1);
            case 1 -> getPositions().setY(y + 1);
            case 2 -> getPositions().setX(x - 1);
            case 3 -> getPositions().setY(y - 1);
            default -> System.out.println("Out of Enum Range");
        }
    }

    @Override
    public PositionRobot getPositions() {
        return this.positions[0];
    }
}
