package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public int getNumberOfItemsLeft() {
        int sum = 0;
        for (Todo todo : todos) {
            if (todo.getState().equals(State.NON_COMPLETED)) {
                sum++;
            }
        }
        return sum;
    }

    public List<String> getMostImportantTodosText() {
        List<String> resultList = new ArrayList<>();
        int min = getMin();
        for (Todo todo : todos) {
            if (todo.getPriority() == min) {
                resultList.add(todo.getText());
            }
        }
        return resultList;
    }

    public void deleteCompleted() {
        Iterator i = todos.iterator();
        while (i.hasNext()) {
            Todo todo = (Todo) i.next();
            if (todo.getState().equals(State.COMPLETED)) {
                i.remove();
            }
        }
    }

    private int getMin() {
        int min = Integer.MAX_VALUE;
        for (Todo todo : todos) {
            if (todo.getPriority() < min) {
                min = todo.getPriority();
            }
        }
        return min;
    }

}
