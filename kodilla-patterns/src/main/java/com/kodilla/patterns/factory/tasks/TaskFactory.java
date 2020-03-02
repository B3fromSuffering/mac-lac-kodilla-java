package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String TaskFactory) {
        switch (TaskFactory) {
            case ShoppingTask:
                return new ShoppingTask("Zakupy w Biedronce", "Kiełbasa podwawelska", 2);
            case PaintingTask:
                return new PaintingTask("Malowanie ścian", "Czerwony", "Smoki");
            case DrivingTask:
                return new DrivingTask("Jedziemy do koleżanki", "Racławicka 20", "Uber");
            default:
                return null;
        }
    }
}
