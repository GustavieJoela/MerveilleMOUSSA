/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PC
 */
public class Partenaire extends User{
    private String NCI;
    private String nomComplet;
    private String address;
    private int tel;

    public Partenaire() {
    }

    public Partenaire(String NCI, String nomComplet, String address, int tel, String login, String pwd) {
        super(login, pwd);
        this.NCI = NCI;
        this.nomComplet = nomComplet;
        this.address = address;
        this.tel = tel;
    }

    public Partenaire(String NCI, String nomComplet, String address, int tel, int id, String login, String pwd) {
        super(id, login, pwd);
        this.NCI = NCI;
        this.nomComplet = nomComplet;
        this.address = address;
        this.tel = tel;
    }

    public Partenaire(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Partenaire(String xxx, String admin, String admin0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Partenaire(String xxx, String admin, String admin0, String admin1, int i, String admin2, String admin3, String admin4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Partenaire(String admin, String admin0, String admin1, String admin2, String admin3, int i, String admin4, String admin5, String admin6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Partenaire(String nci, String nomComplet, String login, String address, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Partenaire(String nci, String nomComplet, String login, String address, String tel, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNCI(String NCI) {
        this.NCI = NCI;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNCI() {
        return NCI;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getAddress() {
        return address;
    }

    public int getTel() {
        return tel;
    }

    public Object getNci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
