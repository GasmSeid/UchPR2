package com.example.Rabota.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String surname;
    private String name;
    private String middlename;
    private String bthday;
    private int SeriaPass;
    private int NomPass;
    private String AdresReg;
    private String Email;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBthday() {
        return bthday;
    }

    public void setBthday(String bthday) {
        this.bthday = bthday;
    }

    public int getSeriaPass() {
        return SeriaPass;
    }

    public void setSeriaPass(int SeriaPass) {
        this.SeriaPass = SeriaPass;
    }

    public int getNomPass() {
        return NomPass;
    }

    public void setNomPass(int NomPass) {
        this.NomPass = NomPass;
    }
    //
    public String getAdresReg() {
        return AdresReg;
    }

    public void setNomPass(String NomPass) {
        this.AdresReg = AdresReg;
    }
    //
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Manager(String surname, String name, String middlename, String bthday, int SeriaPass, int NomPass, String AdresReg, String Email) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.bthday = bthday;
        this.SeriaPass = SeriaPass;
        this.NomPass = NomPass;
        this.AdresReg = AdresReg;
        this.Email = Email;
    }

    public Manager() {
    }
}
