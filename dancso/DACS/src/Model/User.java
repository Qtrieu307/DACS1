/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phamn
 */
public class User {
  private String name;
  private String user;
  private String pass;
  private Boolean tinh_trang;
  private String mail;

    public User(String name, String user, String pass, Boolean tinh_trang, String mail) {
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.tinh_trang = tinh_trang;
        this.mail = mail;
    }

    public User() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Boolean isTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(Boolean tinh_trang) {
        this.tinh_trang = tinh_trang;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", user=" + user + ", pass=" + pass + ", tinh_trang=" + tinh_trang + ", mail=" + mail + '}';
    }
  
}
