package Todos.interfaces;

import Todos.Todo;

public interface TodoInterface {
    public void addTodo(Todo todo);
    public void removeTodo(int menuId);
    public void editTodo(int menuId);
    public void printTodos();
    public void printMenu(boolean start);
}
