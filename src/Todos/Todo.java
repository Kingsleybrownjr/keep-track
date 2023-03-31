package Todos;

import java.util.UUID;

public class Todo {
    private final int menuId;
    private final UUID id = UUID.randomUUID();
    private String text;
    private boolean isCompleted;

    public Todo(int menuId, String text) {
        this.text = text;
        this.menuId = menuId;
    }

    public String getText() {
        return text;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public UUID getId() {
        return id;
    }

    public int getMenuId() {
        return menuId;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
