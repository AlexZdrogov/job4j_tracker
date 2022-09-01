package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item test = new Item();
        Item testToString = new Item(1, "testToString");
        LocalDateTime testCreated = test.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String testCreatedFormat = testCreated.format(formatter);
        System.out.println(testCreatedFormat);
        System.out.println(testToString);
    }
}
