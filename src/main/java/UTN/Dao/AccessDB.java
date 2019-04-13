package UTN.Dao;

import UTN.Model.Human;
import java.util.*;
import java.sql.*;


public class AccessDB {
    static final String DB_URL = "jdbc:mysql://localhost:3306/freshcontest";
    static final String USER = "root";
    static final String PASS = "atila";
    Connection conn = null;

    public void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to freshcontestDB....");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.err.println("Error al conectar.");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void insertWinners(List<Human> winners){
        String winnerName = "";
        int beer;
        try {
            for(Human h : winners) {
                winnerName = h.getName();
                beer = h.getBeer();
                String query = "insert into winners (name, beer_in_body) values (?, ?)";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, winnerName);
                preparedStmt.setInt(2, beer);
                preparedStmt.execute();
            }
        }
        catch (SQLException e){
            System.err.println("Couldn't insert" + winnerName + " into database.");
            e.printStackTrace();
        }
        finally {
                try {
                    conn.close();
                }
                catch (SQLException e){
                    System.err.println("Couldn't close database");
                    e.printStackTrace();
                }
            }
    }
}
