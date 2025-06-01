package ru.yandex.practicum.managers;

import ru.yandex.practicum.models.Task;

import java.util.List;

public interface TaskManager {
    void createTask(Task task);
    Task getTask(int taskId);
    List<Task> getAllTasks();
}
