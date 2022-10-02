package lesson11;

import java.sql.*;

public class Main {
    public static void hw1(){
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT FirstName, LastName, Email FROM customers");
            while (resultSet.next()){
                System.out.printf("First name: %s, last name: %s, email: %s\n",
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hw2(){
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT TrackId FROM invoice_items where UnitPrice > 1");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hw3(){
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT artists.Name as ArtistName, albums.Title as AlbumTitle FROM artists JOIN albums ON artists.ArtistId = albums.ArtistId");
            while (resultSet.next()){
                System.out.printf("Artist: %s, Album: %s\n",
                        resultSet.getString("ArtistName"),
                        resultSet.getString("AlbumTitle"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("HW1");
        hw1();
        System.out.println("HW2");
        hw2();
        System.out.println("HW3");
        hw3();
    }
}
