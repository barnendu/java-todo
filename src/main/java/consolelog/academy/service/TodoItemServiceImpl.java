package consolelog.academy.service;

import consolelog.academy.model.ItemData;
import consolelog.academy.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private final ItemData items = new ItemData();

    public ItemData getItems() {
        return items;
    }

    @Override
    public TodoItem getItem(int id) {
        return items.getItem(id);
    }

    @Override
    public void addItem(TodoItem todo) {
        items.addItem(todo);
    }

    @Override
    public void removeItem(int id) {
        items.removeItem(id);
    }

    @Override
    public void updateItem(TodoItem todo) {
        items.updateItem(todo);
    }
}
