/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.English_Dictionary;
import entity.English_Word;
import entity.Seviye;

/**
 *
 * @author Gokce
 */
public class EnglishWordFactory implements WordFactory {

    @Override
    public Word createWord(int id, String word, String defination, Seviye seviye) {
        return new English_Word(id, word, defination, seviye);
    }

    @Override
    public Dictionary createDictionary(String word, String defination) {
        return new English_Dictionary(word, defination);
    }

}
