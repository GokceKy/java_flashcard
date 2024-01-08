/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flashcard_app;

import Controller.WordSingleton;
import DaoPackages.WordDAO;
import DaoPackages.WordDAOImpl;
import entity.Word;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gokce
 */
public class Flashcard_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//     Word words=new Word(1,"hello","merhaba","A1");
//        System.out.println(words);
//             try{
//                 Class.forName("org.postgresql.Driver");
//                 Connection connection =DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbtest","postgres", "gokce");
//                 System.out.println("Baglanti basarili");
//             }catch(Exception e){
//                 System.out.println(e);
//             }
//        Connection con= Database.getConnection();
//        if(con != null){
//            System.out.println("bağlantı basarili");
//        } 
     //   WordDAO wordDAO = new WordDAOImpl();
        WordDAO wordDAO = WordSingleton.getInstance();
        Word word= wordDAO.get(3);
        System.out.println(word);
     //   Word word=new Word (9,"color","renk",1);
   
    //    int result=wordDAO.insert(word);
       
    //    System.out.println(result);
        
    }

}
