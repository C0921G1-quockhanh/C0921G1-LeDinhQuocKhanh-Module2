package ss23_behavioral_design_pattern.bai4;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("My SQL Storage and user name is " + user.getName());
    }
}
