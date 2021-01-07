/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Depot {
    private int id;
    private double mnt;
    private LocalDate createAt;

    public Depot() {
    }

    public Depot(double mnt, LocalDate createAt) {
        this.mnt = mnt;
        this.createAt = LocalDate.now();
    }

    public Depot(int id, double mnt, LocalDate createAt) {
        this.id = id;
        this.mnt = mnt;
        this.createAt = LocalDate.now();
        
    }

    public Depot(double mnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMnt() {
        return mnt;
    }

    public void setMnt(double mnt) {
        this.mnt = mnt;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    
    
    
    
    
}
