package consolelog.academy.controller;

import consolelog.academy.model.ItemData;
import consolelog.academy.model.TodoItem;
import consolelog.academy.service.TodoItemService;
import consolelog.academy.util.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class ItemController {
    private final TodoItemService todoItemService;

    @Autowired
    public ItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @ModelAttribute
    public ItemData itemData(){
        return todoItemService.getItems();
    }

    @GetMapping("/items")
    public String items(){
        return "item_list";
    }

    @GetMapping("/addEditItem")
    public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model){
        TodoItem todoItem = todoItemService.getItem(id);
        if(todoItem == null){
            todoItem = new TodoItem("","", LocalDate.now());
        }

        model.addAttribute(Attributes.TODO_ITEM,todoItem);
        return "add_item";

    }
    @PostMapping("/addEditItem")
    public String addItem(@ModelAttribute(Attributes.TODO_ITEM) TodoItem todoItem){
        if(todoItem.getId() ==0){
            todoItemService.addItem(todoItem);
        }
        else{
            todoItemService.updateItem(todoItem);
        }
        return"redirect:/items";
    }

    @GetMapping("/delete")
    public String deleteItem(@RequestParam int id){
        todoItemService.removeItem(id);
        return"redirect:/items";
    }
    @GetMapping("/item")
    public String deleteItem(@RequestParam int id, Model model){
        TodoItem todoItem = todoItemService.getItem(id);
        model.addAttribute(Attributes.TODO_ITEM, todoItem);
        return"view_item";
    }
}
