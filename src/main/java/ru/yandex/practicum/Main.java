package ru.yandex.practicum;

import ru.yandex.practicum.inmemorytasks.InMemoryTaskManager;
import ru.yandex.practicum.managers.Managers;
import ru.yandex.practicum.models.Task;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (num) -> (num % 2) == 0;
        System.out.println("число чётное? " + predicate.test(151254));
    }
}