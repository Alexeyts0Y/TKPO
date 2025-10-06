package com.example.interfaces;

import java.util.List;

public interface UserComponent {
    void display();
    String getName();

    default void add(UserComponent component) {
        throw new UnsupportedOperationException();
    }

    default void remove(UserComponent component) {
        throw new UnsupportedOperationException();
    }

    default List<UserComponent> getChildren() {
        throw new UnsupportedOperationException();
    }
}
