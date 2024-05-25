package usermanagement;

public class UserResetPasswordService extends BaseService {
    @Override
    public void execute() {
        System.out.println("Enter your email for password reset:");
        String email = scanner.nextLine();

        if (!db.getUsers().containsKey(email)) {
            System.out.println("No account found with the entered email.");
            return;
        }

        System.out.println("Enter your new password:");
        String newPassword = scanner.nextLine();

        User user = db.getUsers().get(email);
        user.setPassword(newPassword);
        System.out.println("Password has been reset successfully.");
    }
}
