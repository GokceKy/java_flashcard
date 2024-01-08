/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DaoPackages.WordDAO;
import DaoPackages.WordDAOImpl;

/**
 *
 * @author Gokce
 */
public class WordSingleton {

    private static WordDAO wordDAO;

    private WordSingleton() {
        System.out.println("Singleton sınıfından bir nesne oluşturuldu.");
    }
    //   WordDAO wordDAO = new WordDAOImpl();

    public static WordDAO getInstance() {
        if (wordDAO == null) {
            wordDAO = new WordDAOImpl();
        }
        return wordDAO;
    }
}
