package Todos.interfaces;

import Todos.Todo;

public interface TodoInterface {
    private void addTodo(Todo todo) {}
    private void removeTodo(int menuId) {}
    private void editTodo(int menuId) {}
    static void printTodos() {}
    static void printMenu(boolean start) {}
}
