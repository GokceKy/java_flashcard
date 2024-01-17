/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flashcard_app;

import DaoPackages.WordDAO;
import DaoPackages.WordDAOImpl;
import entity.English_Word;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import view.Login;

/**
 *
 * @author Gokce
 */
public class Flashcard_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        //   WordDAO wordDAO = new WordDAOImpl();
        WordDAO wordDAO = WordDAOImpl.getInstance();
        English_Word word = wordDAO.get(3);
        System.out.println(word);

        new Login().setVisible(true);
        //   Word word=new Word (9,"color","renk",1);
        //    int result=wordDAO.insert(word);
        //    System.out.println(result);
    }

}
