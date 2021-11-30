package ss23_behavioral_design_pattern.bai4;

public class StoreTesting {
    public static void main(String[] args) {
        UserController userController = new UserController(new User("Hung"), new MySQLStorage());
        userController.store();

        UserController anotherUserController = new UserController(new User("Thien"), new XMLStorage());
        anotherUserController.store();

    }
}
