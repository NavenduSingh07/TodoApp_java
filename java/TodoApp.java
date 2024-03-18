import java.util.Scanner;

public class TodoApp {
    private TodoList todoList;
    private Scanner scanner;

    public TodoApp() {
        this.todoList = new TodoList();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean quit = false;
        while (!quit) {
            System.out.println("1. Add Todo");
            System.out.println("2. Display Todos");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter todo title: ");
                    String title = scanner.nextLine();
                    todoList.addTodo(title);
                    break;
                case 2:
                    todoList.displayTodos();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TodoApp todoApp = new TodoApp();
        todoApp.start();
    }
}
