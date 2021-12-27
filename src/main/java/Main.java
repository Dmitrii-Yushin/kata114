
import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("имя1", "фамилия1", (byte) 1);
        userService.saveUser("имя2", "фамилия2", (byte) 2);
        userService.saveUser("имя3", "фамилия3", (byte) 3);
        userService.saveUser("имя4", "фамилия4", (byte) 4);
        userService.removeUserById(4);

        Stream<User> users = userService.getAllUsers().stream();
        users.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}