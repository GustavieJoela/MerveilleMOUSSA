/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Compte {
    private int id;
    private int numero;
    private double solde;
    //propriete de navigation
    private Partenaire partenaire;
    private List<Depot> depots;

    public List<Depot> getDepots() {
        return depots;
    }

    public Compte() {
        depots=new ArrayList();
    }

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        this.depots=new ArrayList();
    }

    public Compte(int numero, double solde, Partenaire partenaire) {
        this.numero = numero;
        this.solde = solde;
        this.partenaire = partenaire;
        this.depots=new ArrayList();
    }

    public Compte(int id, int numero, double solde) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
    }

    public Compte(int id, int numero, double solde, Partenaire partenaire) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.partenaire = partenaire;
        this.depots=new ArrayList();
    }

    public Compte(String xxx2, double solde, Partenaire part) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }
    
    
}
