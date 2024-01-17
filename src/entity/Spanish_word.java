/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Controller.Word;

/**
 *
 * @author Gokce
 */
public class Spanish_word implements Word{
     private int spanish_id;
     private String spanish;
     private String turkish;
     private Seviye seviye;
     private String tur;

    public Spanish_word(int spanish_id, String spanish, String turkish,Seviye seviye) {
        this.spanish_id = spanish_id;
        this.spanish = spanish;
        this.turkish = turkish;
         this.seviye = seviye;
    }
    
     
    @Override
    public String getWord() {
      return spanish;
    }

    @Override
    public String getDefination() {
       return turkish;
    }


    
}
