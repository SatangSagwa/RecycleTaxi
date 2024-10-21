package org.example;

import java.util.ArrayList;

public class UserManager {

    ArrayList <User> userList = new ArrayList<>();

    public void addUser (User user) {
        if (userList.contains(user)) {
            System.out.println("The user already exists.");
        }
        else {
            userList.add(user);
            System.out.println("The user added successfully.");
        }
    }

}
