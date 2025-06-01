package ru.yandex.practicum.inmemorytasks;

import ru.yandex.practicum.managers.TaskManager;
import ru.yandex.practicum.models.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTaskManager implements TaskManager {
    int dynamicId = 1;
    Map<Integer, Task> taskHashMap = new HashMap<>();

    @Override
    public void createTask(Task task) {
        if (task != null) {
            taskHashMap.put(dynamicId, task);
            task.setId(dynamicId);
            dynamicId++;
        } else {
            System.out.println("задача не существует");
        }
    }

    @Override
    public Task getTask(int taskId) {
        Task task;
        task =  taskHashMap.getOrDefault(taskId, null);
        return task;
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> resultTasks = new ArrayList<>();
        if (!taskHashMap.isEmpty()) {
            resultTasks.addAll(taskHashMap.values());
        } else {
            System.out.println("нет активных задач");
        }
        return resultTasks;
    }
}
