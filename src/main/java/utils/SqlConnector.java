package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnector {

    public static Connection openConnection(){
        String url = "jdbc:mysql://localhost:3306/laravel?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String user = "root";
        String password = "";

        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            //LOG
        }
        return connection;
    }



}
