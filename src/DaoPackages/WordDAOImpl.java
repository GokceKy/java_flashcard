/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoPackages;

import Controller.EnglishWordFactory;
import service.Database;
import entity.Seviye;

import entity.English_Word;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gokce
 */
public class WordDAOImpl implements WordDAO {
    //DictionaryFactory factory = new DictionaryFactory();

    EnglishWordFactory factory = new EnglishWordFactory();

    private static WordDAOImpl instance;

    private WordDAOImpl() {
        System.out.println("Singleton sınıfından bir nesne oluşturuldu.");
    }

    public static WordDAOImpl getInstance() {
        if (instance == null) {
            instance = new WordDAOImpl();
        }
        return instance;
    }

    @Override
    public English_Word get(int kelime_id) throws SQLException {
        Connection con = Database.getConnection();
        English_Word word = null;
        String sql = "SELECT kelime_id, kelime_eng, kelime_tr, kelime_seviye FROM kelime WHERE kelime_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, kelime_id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int oid = rs.getInt("kelime_id");
            String kelime_eng = rs.getString("kelime_eng");
            String kelime_tr = rs.getString("kelime_tr");
            int seviye_id = rs.getInt("kelime_seviye");
            Seviye seviye = new Seviye();
            seviye.setSeviye_id(seviye_id);
            word = (English_Word) factory.createWord(oid, kelime_eng, kelime_tr, seviye);
            //   word = factory.createWord(oid, kelime_eng, kelime_tr, seviye);

        }
        return word;
    }

    @Override
    public List<English_Word> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(English_Word word) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(English_Word word) throws SQLException {
        Connection con = Database.getConnection();
        String sql = "INSERT INTO kelime (kelime_id, kelime_eng, kelime_tr, kelime_seviye) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, word.getKelime_id());
        ps.setString(2, word.getWord());
        ps.setString(3, word.getDefination());
        ps.setInt(4, word.getSeviye().getSeviye_id());

        int result = ps.executeUpdate();
        Database.closePreparedStatement(ps);
        Database.closePreparedStatement(ps);
        Database.closeConnection(con);
        return result;
    }

    @Override
    public int delete(English_Word t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getMax() throws SQLException {
        Connection con = Database.getConnection();
        int maxId = 0;
        String query = "SELECT MAX(kelime_id) AS maxId FROM kelime";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            maxId = resultSet.getInt("maxId");
        }

        return maxId;
    }

}
