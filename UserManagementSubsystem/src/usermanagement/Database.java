package usermanagement;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database instance = null;
    private Map<String, User> users;

    private Database() {
        users = new HashMap<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Map<String, User> getUsers() {
        return users;
    }
}



