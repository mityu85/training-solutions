package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todos.add(todo);
    }

    public void finishTodos(String caption){
        for (Todo item: todos) {
            if (item.getCaption().equals(caption)) {
                item.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String item: todosToFinish) {
            for (Todo todo: todos) {
                if (todo.getCaption().equals(item)) {
                    todo.finish();
                }
            }
        }
    }

    public List<String> todosToFinish() {
        List<String> todo = new ArrayList<>();
        for (Todo item: todos) {
            if (!item.isFinished()) {
                todo.add(item.getCaption());
            }
        }
        return todo;
    }

    public int numberOfFinishedTodos(){
        int count = 0;
        for (Todo item: todos) {
            if (item.isFinished()) {
                count++;
            }
        }
        return count;
    }

    public String toString(){
        return todos.toString();
    }
}
