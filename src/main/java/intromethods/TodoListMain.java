package intromethods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        todoList.addTodo("Do the homework");
        todoList.addTodo("Clean the room");
        todoList.addTodo("Go out with the dog");

        System.out.println(todoList.todosToFinish());

        todoList.finishTodos("Do the homework");
        System.out.println(todoList.todosToFinish());

        todoList.finishAllTodos(Arrays.asList("Clean the room", "Go out with the dog"));
        System.out.println(todoList.todosToFinish());

        System.out.println(todoList.numberOfFinishedTodos());
    }
}
