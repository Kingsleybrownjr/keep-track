import Todos.Todo;
import Todos.TodoActions;
import Todos.UserInput;

public class Main {
    public static void main(String[] args) {
      var todoApplication = new TodoActions();
      todoApplication.startApp();
    }
}