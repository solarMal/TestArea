package ru.yandex.practicum.managers;

import ru.yandex.practicum.inmemorytasks.InMemoryTaskManager;

public class Managers<T extends TaskManager> {
    public static InMemoryTaskManager getInMemoryTaskManager() {
        return new InMemoryTaskManager();
    }
}
