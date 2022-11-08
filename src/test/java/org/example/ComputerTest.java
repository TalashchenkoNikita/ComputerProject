package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ComputerTest {

    Computer computerLenovo = Computer.builder()
            .cores(4)
            .ram(16)
            .name("Lenovo")
            .system(Computer.OperatingSystem.Windows)
            .build();
    Computer computerHP = Computer.builder()
            .cores(2)
            .ram(2)
            .name("HP")
            .system(Computer.OperatingSystem.Linux)
            .build();

    @Test
    void shouldComputerGameLaunch() {
        assertThat(computerLenovo.computerGameLaunch(computerLenovo)).isEqualTo("Enjoy the game");
    }

    @Test
    void shouldntComputerGameLaunch() {
        assertThat(computerHP.computerGameLaunch(computerHP)).isEqualTo("The game can't launch");
    }

    @Test
    void shouldProjectCompilationSpeed() {
        assertThat(computerHP.projectCompilationSpeed(computerHP)).isEqualTo(25);
    }

    @Test
    void shouldEasyMavenInstall() {
        assertThat(computerHP.mavenInstall(computerHP)).isEqualTo("Maven has been installed");
    }

    @Test
    void shouldDifficultMavenInstall() {
        assertThat(computerLenovo.mavenInstall(computerLenovo)).isEqualTo("You need a lot of patience");
    }
}