package ss23_behavioral_design_pattern.bai4;

public class UserController {
    private User user;
    private UserStorage userStorage;

    public UserController(User user, UserStorage userStorage) {
        this.user = user;
        this.userStorage = userStorage;
    }

    public void store() {
        userStorage.store(user);
    }
}
