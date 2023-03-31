package Todos;

import Todos.interfaces.TodoInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TodoActions implements TodoInterface {
    private final static List<Todo> todosList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void addTodo(Todo todo) {
        todosList.add(todo);
    }

    @Override
    public void removeTodo(int menuId) {
        todosList.removeIf(todo -> todo.getMenuId() == menuId);
    }

    @Override
    public void editTodo(int menuId) {
        System.out.print("Would you like to edit task or complete task, press 1 or 2 accordingly: ");
        var userChoice = Integer.parseInt(scanner.nextLine());

        switch (userChoice) {
            case 1 -> {
                System.out.print("What would you like to edit the task to?: ");
                var newTodo = scanner.nextLine();

                todosList.forEach(todo -> {
                    if (todo.getMenuId() == menuId) {
                        todo.setText(newTodo);
                    }
                });
            }
            case 2 -> todosList.forEach(todo -> {
                if (todo.getMenuId() == menuId) todo.setCompleted(!todo.getIsCompleted());
            });
        }
    }

    @Override
    public void printTodos() {
        if (todosList.size() > 0) {
            System.out.println("Here is a list of your task: \n");
            todosList.forEach(todo ->
                    System.out.printf("%d. %s completed: %b\n",
                            todo.getMenuId(), todo.getText(), todo.getIsCompleted()));
            return;
        }
        System.out.println("No task so far, please add a task.");
    }

    @Override
    public void printMenu(boolean startOfApp) {
        var todoMenu = Arrays.asList(
                "1. See Todos",
                "2. Add Todo",
                "3. Edit Todo",
                "4. Remove Todo",
                "5. Exit Application \n"
        );

        if (!startOfApp) {
            System.out.println("\nWhat would you like to do next?");
            todoMenu.forEach(System.out::println);
            return;
        }
        System.out.println("Hello, Welcome to our App Keep Track \n");
        System.out.println("Here is a list of operations you can perform \n");
        todoMenu.forEach(System.out::println);
    }
}
