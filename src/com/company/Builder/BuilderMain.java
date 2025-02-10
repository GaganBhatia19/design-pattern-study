package com.company.Builder;

public class BuilderMain {
    public static void run() {
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder();
        computerBuilder.addCPU("i5 10gen")
                .addCoolingSystem(true)
                .addRam("16 gb");
        System.out.println(computerBuilder.build().toString());

        ComputerDirector director = new ComputerDirector();
        System.out.println(director.buildGamingPC(new Computer.ComputerBuilder()).toString());
        System.out.println(director.buildNormalPC(new Computer.ComputerBuilder()).toString());
    }
}
