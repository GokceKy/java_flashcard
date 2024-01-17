/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Controller.Dictionary;

/**
 *
 * @author Gokce
 */
public class Spanish_Dictionary implements Dictionary{

    private String spanish;
    private String turkish;

    public Spanish_Dictionary(String spanish, String turkish) {
        this.spanish = spanish;
        this.turkish = turkish;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getTurkish() {
        return turkish;
    }

    public void setTurkish(String turkish) {
        this.turkish = turkish;
    }

    @Override
    public String getKelime() {
         return spanish;
    }

    @Override
    public String getdefination() {
       return turkish;
    }
    

}
