package usermanagement;

public class UserDeleteService extends BaseService {
    @Override
    public void execute() {
        System.out.println("Enter email for account deletion:");
        String email = scanner.nextLine();

        if (db.getUsers().containsKey(email)) {
            db.getUsers().remove(email);
            System.out.println("User account deleted successfully.");
        } else {
            System.out.println("User does not exist!");
        }
    }
}

