/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DaoPackages.WordDAO;
import entity.Dictionary;
import entity.Idioms;
import entity.Seviye;
import entity.Word;

/**
 *
 * @author Gokce
 */
public class DictionaryFactory {
        public static Dictionary createDictionary(String kelime_eng,String kelime_tr) {
        return new Dictionary(kelime_eng, kelime_tr);
    }

    public static Word createWord(int kelime_id,String kelime_eng,String kelime_tr,Seviye seviye) {
        return new Word(kelime_id, kelime_eng, kelime_tr, seviye);
    }
    


}
