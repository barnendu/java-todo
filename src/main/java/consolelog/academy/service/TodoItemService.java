package consolelog.academy.service;
import java.util.List;

import consolelog.academy.model.ItemData;
import consolelog.academy.model.TodoItem;

public interface TodoItemService {
    public ItemData getItems();
    public TodoItem getItem(int id);
    public void addItem(TodoItem todo);
    public void removeItem(int id);
    public void updateItem(TodoItem todo);
}
