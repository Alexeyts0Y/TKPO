package com.example.memento;

import java.util.Stack;

public class UserCaretaker {
    
    private final Stack<UserMemento> mementoHistory = new Stack<>();

    public void saveState(UserMemento memento) {
        mementoHistory.push(memento);
    }

    public UserMemento undo() {
        if (!mementoHistory.isEmpty()) {
            return mementoHistory.pop();
        }
        return null;
    }
}
