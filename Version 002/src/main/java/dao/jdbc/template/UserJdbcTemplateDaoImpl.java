package dao.jdbc.template;

import model.User;
import org.springframework.jdbc.core.JdbcTemplate;



import dao.UserDao;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserJdbcTemplateDaoImpl implements UserDao {

    private static final String SQL_INSERT_USER = "INSERT INTO users(name,surname) VALUES(?, ?) ";

    private static final String SQL_Select_USER_BY_ID = "SELECT * FROM users WHERE id = ?";

    private static final String SQL_SELECT_ALL = "SELECT * FROM users";

    private static final String SQL_SELECT_BY_NAME = "SELECT * FROM users WHERE name = ?";



    private JdbcTemplate template;

    private Map<Integer, User> userMap;

    public UserJdbcTemplateDaoImpl(DataSource dataSource){
        this.template = new JdbcTemplate(dataSource);
        this.userMap = new HashMap<Integer, User>();
    }


    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("email"),
                    resultSet.getString("mobilephone"),
                    resultSet.getString("position"),
                    resultSet.getString("status"));

            return user;
        }
    };


    public List<User> findAllByName(String name) {
        List<User> userList = template.query(SQL_SELECT_BY_NAME,userRowMapper, name);
        return userList;
    }

    public void save(final User model) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        template.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(SQL_INSERT_USER, new String[] {"id"});
                        ps.setString(1, model.getName());
                        ps.setString(2, model.getSurname());
                        return ps;
                    }
                }, keyHolder);

        model.setId(keyHolder.getKey().intValue());

    }

    public User find(int id) {
        return template.queryForObject(SQL_Select_USER_BY_ID, userRowMapper,id);
    }

    public void update(User model) {

    }

    public void delete(int i) {

    }

    public List<User> findAll() {
        List<User> userList = template.query(SQL_SELECT_ALL,userRowMapper);

        return userList ;
       // System.out.println(template);
//        Collection<User> userCollection = userMap.values();
//        List<User> userList = new ArrayList<User>(userCollection);
//        userMap.clear();
//
//
//        return userList;
    }
}
