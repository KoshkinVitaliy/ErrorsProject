package domain;

import business.User;
import data.DataIMPL;

import java.util.Scanner;

public class AppInteraction {
    public static void start() {
        System.out.println("Choose option;");
        System.out.println("1 - Add new user;");
        System.out.println("2 - Get user data by ID;");
        System.out.println("3 - Delete user by ID;");
        System.out.println("4 - Show all users;");

        getUserChoice();
    }

    private static void getUserChoice() {
       int choice = useScanner();

       DataIMPL data = new DataIMPL();
       switch (choice) {
           case 1 -> data.setNewUser(new User(useScanner(), useScanner(), useScanner()));
           case 2 -> data.getUser(0);
           case 3 -> data.deleteUser(useScanner());
           case 4 -> data.showAllUsers();
       }
    }

    private static int useScanner() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
