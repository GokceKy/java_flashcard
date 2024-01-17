/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.io.*;

/**
 *
 * @author Gokce
 */
public class Idioms extends English_Word{
    int Idioms_id;
    String idiom;

    public Idioms(int kelime_id, String kelime_eng, String kelime_tr, Seviye seviye) {
        super(kelime_id, kelime_eng, kelime_tr, seviye);
    }

    

    public int getIdioms_id() {
        return Idioms_id;
    }

    public void setIdioms_id(int Idioms_id) {
        this.Idioms_id = Idioms_id;
    }

    public String getIdiom() {
        return idiom;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    @Override
    public String toString() {
        return "Idioms{" + "Idioms_id=" + Idioms_id + ", idiom=" + idiom + '}';
    }
    
}
