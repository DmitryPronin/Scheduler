import dao.UserDao;
import dao.jdbc.template.UserJdbcTemplateDaoImpl;
import model.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("qwerty");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/test");

        UserDao userDao = new UserJdbcTemplateDaoImpl(dataSource);

        User users = userDao.find(2);

        System.out.println(users);
        List<User> userList= userDao.findAll();
        List<User> userListByName = userDao.findAllByName("Dima");
        //System.out.println(userList);
        System.out.println(userListByName);

}

}

