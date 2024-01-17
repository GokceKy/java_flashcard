/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoPackages;

import Controller.EnglishWordFactory;
import DaoPackages.DictionaryDAO;
import entity.English_Dictionary;
import service.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import service.Database;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokce
 */
public class EngDictionaryDAOImpl implements DictionaryDAO {

    //DictionaryFactory df = new DictionaryFactory();
    EnglishWordFactory df = new EnglishWordFactory();

    @Override
    public English_Dictionary get(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public English_Dictionary getTR(String kelime_tr) throws SQLException {
        Connection con = Database.getConnection();
        English_Dictionary dictionary = null;

        try {
            String sql = "SELECT kelime_eng, kelime_tr FROM kelime WHERE kelime_tr = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, kelime_tr);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String kelime_eng = rs.getString("kelime_eng");
                        String kelime_tr_result = rs.getString("kelime_tr");

                        // Create a new Dictionary object
                        dictionary = (English_Dictionary) df.createDictionary(kelime_eng, kelime_tr);

                    }
                }
            }
        } finally {
            // Close the connection in a finally block to ensure it's closed even if an exception occurs
            if (con != null) {
                con.close();
            }
        }

        return dictionary;
    }

    public English_Dictionary getENG(String kelime_eng) throws SQLException {
        Connection con = Database.getConnection();
        English_Dictionary dictionary = null;

        try {
            String sql = "SELECT kelime_eng, kelime_tr FROM kelime WHERE kelime_eng = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, kelime_eng);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String kelime_tr = rs.getString("kelime_tr");
                        String kelime_english = rs.getString("kelime_eng");

                        // Create a new Dictionary object
                        dictionary = (English_Dictionary) df.createDictionary(kelime_eng, kelime_tr);
                    }
                }
            }
        } finally {
            // Close the connection in a finally block to ensure it's closed even if an exception occurs
            if (con != null) {
                con.close();
            }
        }

        return dictionary;
    }

    @Override
    public List<English_Dictionary> getAll() throws SQLException {
        List<English_Dictionary> dictionaryList = new ArrayList<>();
        Connection con = Database.getConnection();
        String query = "SELECT kelime_eng, kelime_tr FROM kelime";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            String kelime_eng = resultSet.getString("kelime_eng");
            String kelime_tr = resultSet.getString("kelime_tr");
            English_Dictionary dictionary = (English_Dictionary) df.createDictionary(kelime_eng, kelime_tr);
            dictionaryList.add(dictionary);
        }
        return dictionaryList;
    }

    public English_Dictionary getNextWord() throws SQLException {
        Connection con = Database.getConnection();
        String query = "SELECT * FROM kelime ORDER BY RANDOM() LIMIT 1";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            String kelime_eng = resultSet.getString("kelime_eng");
            String kelime_tr = resultSet.getString("kelime_tr");
            English_Dictionary dictionary = (English_Dictionary) df.createDictionary(kelime_eng, kelime_tr);
            return dictionary;
        } else {
            return null;
        }

    }

    @Override
    public int save(English_Dictionary t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(English_Dictionary t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(English_Dictionary t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getMax() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
