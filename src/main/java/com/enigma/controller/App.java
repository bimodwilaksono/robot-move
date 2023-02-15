package com.enigma.controller;

import com.enigma.model.PositionRobot;
import com.enigma.repository.PositionRepositoryImpl;
import com.enigma.service.PositionServiceImpl;

public class App {
    public void run() {
        PositionRepositoryImpl positionRepository = new PositionRepositoryImpl();
        PositionServiceImpl positionService = new PositionServiceImpl(positionRepository);

        PositionRobot initialPos = new PositionRobot("E", 2, 3);
        String commands = "ALAARALLAAA";
        System.out.println("inputPos : " + initialPos);
        positionService.registerPosition(initialPos);
        positionService.moveRobot(commands); //passing command
        System.out.println("Repo : " + positionRepository.getPositions());
    }
}
