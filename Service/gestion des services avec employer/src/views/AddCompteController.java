/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Compte;
import models.Partenaire;
import services.Transaction;

/**
 *
 * @author PC
 */
public class AddCompteController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtNci;
    @FXML
    private TextField txtNomPrenom;
    @FXML
    private TextField txtTel;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPassword;
    
   private Transaction service;
    @FXML
    private TextField txtSolde;
    Partenaire part;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        service=new Transaction();
    }    

    @FXML
    private void handleSearchPartenaire(ActionEvent event) {
        String nci=txtNci.getText();
        this.part=service.getPartenaireByNci(nci);
        if(part!=null){
            txtNomPrenom.setText(part.getNomComplet());
            txtAddress.setText(part.getAddress());
            txtLogin.setText(part.getLogin());
            txtPassword.setText(part.getPwd());
            this.activeOrDisableFields(true);
        }else{
            this.activeOrDisableFields(false);
            this.clearFields();
        }
    }
    private void activeOrDisableFields(Boolean etat){
            txtNomPrenom.setDisable(etat);
            txtAddress.setDisable(etat);
            txtLogin.setDisable(etat);
            txtPassword.setDisable(etat);
    
    
    }
    private void clearFields(){
            txtNomPrenom.clear();
            txtAddress.clear();
            txtLogin.clear();
            txtPassword.clear();
    
    
    }

    @FXML
    private void handleCreerCompte(ActionEvent event) {
        double solde=Double.parseDouble(txtSolde.getText());
        if(part==null){
            String nci=txtNci.getText();
            String nomComplet=txtNomPrenom.getText();
            String address=txtAddress.getText();
            String tel=txtTel.getText();
            String login=txtLogin.getText();
            String pwd=txtPassword.getText();
            part=new Partenaire(nci, nomComplet, login, address, tel, pwd);
        }
        Compte compte=new Compte("xxx2",solde,part); 
        service.addCompteTransaction(compte);
        //this.loadTableView
        oblComptes.add(compte);     
    }
}
