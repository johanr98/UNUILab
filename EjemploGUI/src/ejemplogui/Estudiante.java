/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

/**
 *
 * @author Ivan Delgado
 */
public class Estudiante {
    String name;
    String lastName;
    int landLine;
    int movilPhone;
    String mail;
    String address;

    public Estudiante(String name, String lastName, int landLine, int movilPhone, String mail, String address) {
        this.name = name;
        this.lastName = lastName;
        this.landLine = landLine;
        this.movilPhone = movilPhone;
        this.mail = mail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLandLine() {
        return landLine;
    }

    public int getMovilPhone() {
        return movilPhone;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLandLine(int landLine) {
        this.landLine = landLine;
    }

    public void setMovilPhone(int movilPhone) {
        this.movilPhone = movilPhone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
