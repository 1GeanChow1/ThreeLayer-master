package src.main.java.dao;

import java.sql.*;

public class DBConnection {
    final static String diver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final static String url="jdbc:sqlserver://localhost:1433;DatabaseName=stock;";
    final static String username="sa";
    final static String password="asdfgh9811MSX";

    public Connection connection=null;
    DBConnection(){
        openConnection();
    }
    
    public static void main() {
    	DBConnection db = new DBConnection();
    	
    	db.openConnection();
    }
    
    public boolean openConnection(){
        if (connection!=null){
            return true;
        }
        try {
            connection = DriverManager.getConnection(url,username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return connection!=null;
    }
    public CallableStatement getStatement(String sql){
        try {
            return connection.prepareCall(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet executeSelectQuery(CallableStatement statement){
        ResultSet set;
        try {
            set = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return set;
    }
    public boolean executeInsertQuery(CallableStatement statement){
        boolean result;
        try {
            result = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return result;
    }
    public int executeUpdateQuery(CallableStatement statement){
        int result;
        try {
            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return result;
    }
}
