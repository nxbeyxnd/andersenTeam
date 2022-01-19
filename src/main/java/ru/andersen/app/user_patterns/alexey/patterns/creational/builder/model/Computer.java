package ru.andersen.app.user_patterns.alexey.patterns.creational.builder.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.builder.model
*/

public class Computer {
    private final Processor processor;
    private final String videoadapter;
    private final String motherboard;
    private final int ram;
    private final String powerBlock;

    public static class Builder {
        private final Processor processor;
        private final String videoadapter;

        private String motherboard = "Asus";
        private int ram = 64;
        private String powerBlock = "640W";

        public Builder(Processor Processor, String Videoadapter) {
            this.processor = Processor;
            this.videoadapter = Videoadapter;
        }

        public Builder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder powerBlock(String powerBlock) {
            this.powerBlock = powerBlock;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    private Computer(Builder builder) {
        processor = builder.processor;
        videoadapter = builder.videoadapter;
        motherboard = builder.motherboard;
        ram = builder.ram;
        powerBlock = builder.powerBlock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", videoadapter='" + videoadapter + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram=" + ram +
                ", powerBlock='" + powerBlock + '\'' +
                '}';
    }
}
