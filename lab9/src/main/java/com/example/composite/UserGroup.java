package com.example.composite;

import java.util.ArrayList;
import java.util.List;

import com.example.interfaces.UserComponent;

public class UserGroup implements UserComponent {

    private String groupName;
    private List<UserComponent> children = new ArrayList<>();

    public UserGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void display() {
        System.out.println("=== Группа: " + groupName + " ===");
        for (UserComponent component : children) {
            component.display();
        }
    }

    @Override
    public String getName() {
        return groupName;
    }

    @Override
    public void add(UserComponent component) {
        children.add(component);
    }

    @Override
    public void remove(UserComponent component) {
        children.remove(component);
    }

    @Override
    public List<UserComponent> getChildren() {
        return children;
    }
}
