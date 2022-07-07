import model.User;
import service.UserServiceImp;

import java.util.List;

public class App {
    private static UserServiceImp userService = new UserServiceImp();
    public static void main(String[] args) {
        userService.insert(User.builder().guid(1).systemName("qwe").email("asd").phone("zxc").build());
        List<User> users = userService.getAll();
        System.out.println(users.toString());
    }
}
