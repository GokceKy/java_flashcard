/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Gokce
 */
public class Seviye {
    private int seviye_id;
    private String seviye;
    
    

    public int getSeviye_id() {
        return seviye_id;
    }

    public void setSeviye_id(int seviye_id) {
        this.seviye_id = seviye_id;
    }

    public String getSeviye() {
        return seviye;
    }

    public void setSeviye(String seviye) {
        this.seviye = seviye;
    }

    @Override
    public String toString() {
        return "Seviye{" + "seviye_id=" + seviye_id + ", seviye=" + seviye + '}';
    }
    
}
