/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gokce
 */
public class RealUser extends User implements AuthenticationService {

    public RealUser(String email,String password) {
        super(email,password);
    }
    
   

    @Override
    public boolean authenticate() {
           try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbtest", "postgres", "gokce")) {
            String query = "SELECT * FROM login WHERE email = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, getEmail());
                preparedStatement.setString(2, getPassword());

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Eğer sonuç bulunursa, giriş başarılı kabul edilir
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Veritabanı hatası durumunda giriş başarısız
        }
    }
}
