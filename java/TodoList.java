import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void addTodo(String title) {
        todos.add(new Todo(title));
    }

    public void displayTodos() {
        if (todos.isEmpty()) {
            System.out.println("No todos found.");
        } else {
            System.out.println("Todos:");
            for (Todo todo : todos) {
                System.out.println(todo);
            }
        }
    }
}
