import Todos.Todo;
import Todos.TodoActions;
import Todos.UserInput;

public class Main {
    public static void main(String[] args) {
        var todoActions = new TodoActions();
        todoActions.printMenu(true);

        var userInput = new UserInput();
        var userChoice = userInput.getInitialQuestion();

        var isProgramRunning = true;
        var currentCount = 1;

        while(isProgramRunning) {

            switch (userChoice) {
                case 1 -> todoActions.printTodos();
                case 2 -> {
                    var newTodo = new Todo(currentCount++, userInput.getTodoQuestion("newTodo"));
                    todoActions.addTodo(newTodo);
                }
                case 3 -> {
                    var todoToEdit = userInput.convertStringToInt(userInput.getTodoQuestion("editTodo"));
                    todoActions.editTodo(todoToEdit);
                }
                case 4 -> {
                    var todoToRemove = userInput.convertStringToInt(userInput.getTodoQuestion("removeTodo"));
                    todoActions.removeTodo(todoToRemove);
                }
                case 5 -> isProgramRunning = false;
            }

            if(!isProgramRunning) {
                System.out.println("\nThanks for using Keep Track, Goodbye!");
                break;
            }
            todoActions.printMenu(false);
            userChoice = userInput.getInitialQuestion();
        }
    }
}