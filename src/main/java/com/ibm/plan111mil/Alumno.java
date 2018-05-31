/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.plan111mil;

/**
 *
 * @author fmgordillo
 */
public class Alumno {
    
    String firstname;
    String lastname;
    String telephone;

    public Alumno(String firstname, String lastname, String telephone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Alumno{" + "firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + '}';
    }
    
}
