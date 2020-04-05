package ua.lviv.iot.lab6;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class RemoverTest {
    private Remover redactor;

    @BeforeEach
    public void createRedactor() {
        redactor = new Remover();
    }

    @Test
    public void testRemoveWords() {
        StringBuilder textToCheck = new StringBuilder(
                "a123-45m is something alm0st special for you");
        assertEquals("a123-45m is something alm0st special for you",
                redactor.removeWords(textToCheck));
    }

    @Test
    public void testScanConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            StringBuilder textFromConsole = new StringBuilder(scanner.nextLine());
            redactor.removeWords(new StringBuilder(redactor.removeWords(textFromConsole)));
        }
        scanner.close();
    }

}