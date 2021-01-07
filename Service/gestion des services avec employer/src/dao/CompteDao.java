/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Compte;

/**
 *
 * @author PC
 */
public class CompteDao implements ICompteDao {
    private  List<Compte> tableCompte;

    public CompteDao(){
        tableCompte = new ArrayList();
    }
    @Override
    public Compte add(Compte compte){
        tableCompte.add(compte);
        return compte;
    }
    @Override
    public List<Compte> selectAll(){
        return tableCompte;
    }
    
}
