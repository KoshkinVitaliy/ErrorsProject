package data;

import business.DataAPI;
import business.DataConnection;
import business.User;
import business.Users;

import java.io.File;
import java.io.FileWriter;

public class DataIMPL implements DataAPI, DataConnection {
    @Override
    public String getUser(int id) {
        Users.updateUsers();

        return new String(
                Users.getUsers().get(id).getId() + " " +
                Users.getUsers().get(id).getName() + " " +
                Users.getUsers().get(id).getPassword());
    }

    @Override
    public void setNewUser(User user) {
        File dataFile = connectData("path");
        FileWriter writer = new FileWriter(dataFile);

        String newUserData = user.getId() + "   " + user.getName() + "    " + user.getPassword();
        writer.write(newUserData);

    }

    @Override
    public void deleteUser(int id) {
        File dataFile = connectData("path");
        Users.getUsers().remove(id);
    }

    @Override
    public void updateUser(User user) {
        File dataFile = connectData("path");

    }

    @Override
    public void showAllUsers() {
        System.out.println(Users.getUsers());
    }
}
