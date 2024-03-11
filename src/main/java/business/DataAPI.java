package business;

public interface DataAPI {
    String getUser(int id);

    void setNewUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    void showAllUsers();
}
