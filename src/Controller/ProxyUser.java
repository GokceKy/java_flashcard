/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entity.User;



/**
 *
 * @author Gokce
 */
public class ProxyUser extends User implements AuthenticationService{

    private RealUser realUser;

    public ProxyUser( String email, String password) {
        super(email, password);
    }
    @Override
    public boolean authenticate() {
        if (realUser == null) {
            realUser = new RealUser(getEmail(), getPassword());
        }

        // Proxy üzerinden gerçek kullanıcıyı kontrol et
        return realUser.authenticate();
    }

}
