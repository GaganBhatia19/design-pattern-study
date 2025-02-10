package com.company.Builder;

public class Computer {
    private String processor;
    private String ramSize;
    private String hardDiskSize;
    private boolean coolingSystem;
    private String graphicCard;

    public void show() {
        this.toString();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public boolean isCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(boolean coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", hardDiskSize='" + hardDiskSize + '\'' +
                ", coolingSystem=" + coolingSystem +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }
    public static class ComputerBuilder {
        private Computer computer;
        ComputerBuilder() {
            computer = new Computer();
        }
        public Computer build() {
            return computer;
        }
        public ComputerBuilder addCPU(String cpu) {
            computer.setProcessor(cpu);
            return this;
        }
        public ComputerBuilder addRam(String ramSize) {
            computer.setRamSize(ramSize);
            return this;
        }
        public ComputerBuilder addGraphicCard(String graphicCard) {
            computer.setGraphicCard(graphicCard);
            return this;
        }
        public ComputerBuilder addCoolingSystem(boolean flag) {
            computer.setCoolingSystem(flag);
            return this;
        }

    }
}
