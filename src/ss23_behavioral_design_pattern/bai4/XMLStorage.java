package ss23_behavioral_design_pattern.bai4;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("XML Storage and user name is " + user.getName());
    }
}
