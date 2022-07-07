package dao;

import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao {
    private static Logger logger = LoggerFactory.getLogger(UserDaoImp.class);
    private static final String URL = "jdbc:postgresql://localhost:5432/sber";
    private static final String PASS = "";
    private static final String USER = "postgres";
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS);
            Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                User user = User.builder()
                        .guid(resultSet.getInt(1))
                        .systemName(resultSet.getString(2))
                        .email(resultSet.getString(3))
                        .phone(resultSet.getString(4))
                        .build();
                users.add(user);
            }

        }
        catch (SQLException e)
        {
            logger.error(e.getMessage());
        }
        logger.error("GetUsers");
        return users;

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void insertAll(List<User> users) {

    }

}
