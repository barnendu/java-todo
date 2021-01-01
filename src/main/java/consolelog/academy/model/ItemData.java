package consolelog.academy.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ItemData {
    private static int idValue = 1;
    private List<TodoItem> items = new ArrayList<>();


    public ItemData() {
        // add some static data//
        addItem(new TodoItem("first task","first task", LocalDate.now()));
        addItem(new TodoItem("second task","second task", LocalDate.now()));
        addItem(new TodoItem("third task","third task", LocalDate.now()));
    }

    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(TodoItem addTodo) {
        if (addTodo == null) {
            throw new NullPointerException("todo must have some values");
        }
        addTodo.setId(idValue);
        items.add(addTodo);
        idValue++;
    }
    public void removeItem(int id){
        ListIterator<TodoItem> listIterator = items.listIterator();
        while(listIterator.hasNext()){
            TodoItem item = listIterator.next();
            if(item.getId() == id){
                items.remove(item);
                break;
            }
        }
    }
    public TodoItem getItem(int id){
        for(TodoItem item : items){
            if(item.getId() == id){
                return item;
            }
        }
        return  null;
    }
    public void updateItem(TodoItem updatedItem){
        ListIterator<TodoItem> listIterator = items.listIterator();
        while(listIterator.hasNext()){
            TodoItem item = listIterator.next();
            if(item.equals(updatedItem)){
                listIterator.set(updatedItem);
            }
        }
    }
}
