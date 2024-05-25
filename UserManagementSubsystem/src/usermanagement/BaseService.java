package usermanagement;

import java.util.Scanner;

public abstract class BaseService implements UserService {
    protected Database db;
    protected Scanner scanner;

    public BaseService() {
        this.db = Database.getInstance(); // Ensure there's only one instance of the database
        this.scanner = new Scanner(System.in);
    }

    @Override
    public abstract void execute(); // Implement this method in subclasses
}

