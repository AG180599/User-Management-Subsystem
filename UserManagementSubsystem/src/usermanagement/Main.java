package usermanagement;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Create instances of the services
        UserService registrationService = new UserRegistrationService();
        UserService loginService = new UserLoginService();
        UserService deleteAccountService = new UserDeleteService();
        UserService resetPasswordService = new UserResetPasswordService();

        while (running) //is the running is the parameter that you added in the while loop? {        
            System.out.println("Welcome to the Hotel Booking System");
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. Reset Password");
            System.out.println("4. Delete User Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left-over

            switch (choice) {
                case 1:
                    registrationService.execute();
                    break;
                case 2:
                    loginService.execute();
                    break;
                case 3:
                    resetPasswordService.execute();
                    break;
                case 4:
                    deleteAccountService.execute();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

