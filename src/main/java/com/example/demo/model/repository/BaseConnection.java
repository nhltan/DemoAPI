package com.example.demo.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class BaseConnection {
    static String url = "jdbc:mysql://localhost:3306/demo";
    static String username = "root";
    static String password = "1234";
    static String nameClass = "com.mysql.cj.jdbc.Driver";

    
    // Kiểm tra kết nối tới cơ sở dữ liệu
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "1234";
        try (
        Connection connection = DriverManager.getConnection(url, username, password))
        {
        if (connection != null) {
        System.out.println("Kết nối thành công!");
        } else {
        System.out.println("Kết nối thất bại!");
        }
        } catch (SQLException e) {
        System.out.println("Lỗi kết nối: " + e.getMessage());
        }
        }
}
