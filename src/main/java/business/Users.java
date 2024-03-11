package business;

import data.DataIMPL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class Users {
    private static List<User> users;

    public static List<User> getUsers() {
        return users;
    }

    public static void updateUsers() {
        DataIMPL data = new DataIMPL();

        File dataFile = data.connectData("path");
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));

        String line = reader.readLine();

        while (line != null) {
            String[] lineArr = line.split(" ");
            User user = new User(lineArr[0], lineArr[1], Integer.parseInt(lineArr[2]));
            users.add(user);
            // read next line
            line = reader.readLine();
        }
    }
}
