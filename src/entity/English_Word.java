/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Controller.Word;
import entity.Seviye;
import java.io.*;

/**
 *
 * @author Gokce
 */
public class English_Word implements Cloneable, Word {

    private int kelime_id;
    private String kelime_eng;
    private String kelime_tr;
    private Seviye seviye;
    private String tur;

    public English_Word(int kelime_id, String kelime_eng, String kelime_tr, Seviye seviye) {
        this.kelime_id = kelime_id;
        this.kelime_eng = kelime_eng;
        this.kelime_tr = kelime_tr;
        this.seviye = seviye;
    }

    public English_Word(String kelime_eng, String kelime_tr, String tur) {
        this.kelime_eng = kelime_eng;
        this.kelime_tr = kelime_tr;
        this.tur = tur;
    }

    @Override
    public English_Word clone() throws CloneNotSupportedException {

        return new English_Word(this.kelime_eng, this.kelime_tr, this.tur);

    }
     @Override
    public String getWord() {
        return kelime_eng;
    }

    @Override
    public String getDefination() {
        return kelime_tr;
    }

    @Override
    public String toString() {
        return "Word{" + "kelime_id=" + kelime_id + ", kelime_eng=" + kelime_eng + ", kelime_tr=" + kelime_tr + ", seviye=" + seviye + '}';
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
      this.tur = tur;
    }

    public Seviye getSeviye() {
        return seviye;
    }

    public void setSeviye(Seviye seviye) {
       this.seviye = seviye;
    }

    public int getKelime_id() {
        return kelime_id;
    }

    public void setKelime_id(int kelime_id) {
        this.kelime_id = kelime_id;
    }

    public void setKelime_eng(String kelime_eng) {
        this.kelime_eng = kelime_eng;
    }

    public void setKelime_tr(String kelime_tr) {
        this.kelime_tr = kelime_tr;
    }

   

}
