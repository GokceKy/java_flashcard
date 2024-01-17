/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.English_Dictionary;
import entity.Seviye;
import entity.Spanish_Dictionary;
import entity.Spanish_word;

/**
 *
 * @author Gokce
 */
public class SpanishWordFactory implements WordFactory {

    @Override
    public Word createWord(int id,String word,String defination,Seviye seviye) {
              return new Spanish_word( id,word,defination,seviye);
    }

    @Override
    public Dictionary createDictionary(String word, String defination) {
        return new Spanish_Dictionary(word,defination);
    }


    
}
