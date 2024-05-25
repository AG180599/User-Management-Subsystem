package usermanagement;

public class UserLoginService extends BaseService {
    @Override
    public void execute() {
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (db.getUsers().containsKey(email) && db.getUsers().get(email).getPassword().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password!");
        }
    }
}

