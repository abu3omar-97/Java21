package JDBC;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        String connectionURL = "jdbc:mysql://localhost:3306/supermarket";
        String user = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(connectionURL, user, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet  = statement.executeQuery("Select * from cities limit 10");

        ArrayList<String> cities = new ArrayList<>();

        while (resultSet.next())
             cities.add(resultSet.getString("name"));


        System.out.println(cities);


        // INSERT
//        String name = JOptionPane.showInputDialog("PLEASE ENTER YOUR NAME:");
//        String email = JOptionPane.showInputDialog("PLEASE ENTER YOUR EMAIL:");
//        statement.executeUpdate("INSERT INTO `customers` (`name`, `email`) VALUES ('" + name + "', '" + email + "');");



    }
}
