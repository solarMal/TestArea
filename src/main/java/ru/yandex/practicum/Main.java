package ru.yandex.practicum;

import ru.yandex.practicum.inmemorytasks.InMemoryTaskManager;
import ru.yandex.practicum.managers.Managers;
import ru.yandex.practicum.models.Task;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        InMemoryTaskManager inMemoryTaskManager = Managers.getInMemoryTaskManager();

        Task firstTask = new Task("firstTask", "descriptionFirstTask");
        Task secondTask = new Task("secondTask", "descriptionSecondTask");

        inMemoryTaskManager.createTask(firstTask);
        Task task1 = inMemoryTaskManager.getTask(firstTask.getId());

        inMemoryTaskManager.createTask(secondTask);
        Task task2 = inMemoryTaskManager.getTask(secondTask.getId());

        List<Task> tasks = inMemoryTaskManager.getAllTasks();

        for (Task task : tasks) {
            System.out.println(task);
        }

        System.out.println("ёу");
    }
}