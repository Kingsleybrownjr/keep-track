package Todos;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    private int initialQuestion() {
        System.out.print("Which operation you'd like to perform (Use #): ");
        return Integer.parseInt(scanner.nextLine());
    }

    private String todoQuestions(String task) {
        switch (task) {
            case "newTodo" -> System.out.print("\nPlease write in your new task: ");
            case "editTodo" -> {
                var todoActions = new TodoActions();
                todoActions.printTodos();
                System.out.print("\nWhich task would you like to edit?: ");
            }
            case "removeTodo" -> System.out.print("\nWhich task would you like to remove?: ");
        }
        return scanner.nextLine();
    }

    public int convertStringToInt(String userInput) {
        return Integer.parseInt(userInput);
    }

    public int getInitialQuestion() {
        return initialQuestion();
    }

    public String getTodoQuestion(String task) {
        return todoQuestions(task);
    }
}
