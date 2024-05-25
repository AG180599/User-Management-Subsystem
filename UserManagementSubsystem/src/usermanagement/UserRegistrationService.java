package usermanagement;

import java.util.Map;
import java.util.Scanner;

public class UserRegistrationService extends BaseService {
    public UserRegistrationService() {
        super();
    }

    @Override
    public void execute() {
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        Map<String, User> users = db.getUsers(); // Access the user map from the database instance

        if (users.containsKey(email)) {
            System.out.println("User already exists!");
        } else {
            User newUser = new User(email, password, name);
            users.put(email, newUser);
            System.out.println("User registered successfully!");
        }
    }
}
