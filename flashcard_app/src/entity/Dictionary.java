/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Gokce
 */
public class Dictionary {
 String kelime_eng;
 String kelime_tr;

    public Dictionary(String kelime_eng, String kelime_tr) {
        this.kelime_eng = kelime_eng;
        this.kelime_tr = kelime_tr;
    }

    public String getKelime_eng() {
        return kelime_eng;
    }

    public void setKelime_eng(String kelime_eng) {
        this.kelime_eng = kelime_eng;
    }

    public String getKelime_tr() {
        return kelime_tr;
    }

    public void setKelime_tr(String kelime_tr) {
        this.kelime_tr = kelime_tr;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "kelime_eng=" + kelime_eng + ", kelime_tr=" + kelime_tr + '}';
    }
  
    
}
