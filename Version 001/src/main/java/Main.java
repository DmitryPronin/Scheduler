import java.sql.*;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException, InterruptedException, SQLException {
        String user = "postgres";
        String password = "qwerty";
        String url = "jdbc:postgresql://localhost:5432/test";
        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

        while (resultSet.next()) {
            System.out.print(resultSet.getInt("user_id"));
            System.out.println(" " + resultSet.getString("name"));
        }




//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter USer NAme");
//        String name = scanner.next();
//        System.out.println("Enter email");
//        String email = scanner.next();
//
//        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2, email);
//        preparedStatement.execute();

    }
}
