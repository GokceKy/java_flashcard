/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import entity.Seviye;

/**
 *
 * @author Gokce
 */
public interface WordFactory {

    Word createWord(int id, String word, String defination, Seviye seviye);

    Dictionary createDictionary(String word, String defination);
}
