/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phamn
 */

    public class EmailStorage {
    private static EmailStorage instance;
    private String email;

    private EmailStorage() {
        // Private constructor to prevent instantiation
    }

    public static EmailStorage getInstance() {
        if (instance == null) {
            instance = new EmailStorage();
        }
        return instance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}


