package org.example;

import java.util.UUID;

public class Computer {
    private int ram;
    private int cores;
    private String name;
    private UUID number;
    private OperatingSystem system;

    public Computer(int ram, int cores, String name, OperatingSystem system) {
        this.ram = ram;
        this.cores = cores;
        this.name = name;
        this.system = system;
        number = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cores=" + cores +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", system=" + system +
                '}';
    }

    public String computerGameLaunch(Computer computer) {
        if (cores < 4 || ram < 8) {
            return "The game can't launch";
        }
        return "Enjoy the game";
    }

    public int projectCompilationSpeed(Computer computer) {
        int defaultValue = 100;
        return defaultValue / cores / ram;
    }

    public String mavenInstall(Computer computer) {
        if (system == OperatingSystem.Windows) {
            return "You need a lot of patience";
        }
        return "Maven has been installed";
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    enum OperatingSystem {
        Windows,
        Linux,
        MacOS
    }

    public static class ComputerBuilder {
        private int ram;
        private int cores;
        private String name;
        private UUID number;
        private OperatingSystem system;

        public ComputerBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder cores(int cores) {
            this.cores = cores;
            return this;
        }

        public ComputerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ComputerBuilder number() {
            this.number = UUID.randomUUID();
            return this;
        }

        public ComputerBuilder system(OperatingSystem system) {
            this.system = system;
            return this;
        }

        public Computer build() {
            return new Computer(ram, cores, name, system);
        }


    }
}