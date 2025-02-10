package com.company.Builder;

public class ComputerDirector {
    public Computer buildGamingPC(Computer.ComputerBuilder computerBuilder) {
        return computerBuilder.addRam("32 gb")
                .addCPU("i7 9gen")
                .addCoolingSystem(true)
                .addGraphicCard("rtx 3060").build();
    }
    public Computer buildNormalPC(Computer.ComputerBuilder computerBuilder) {
        return computerBuilder.addRam("8 gb")
                .addCPU("i5 9gen").build();
    }
}
