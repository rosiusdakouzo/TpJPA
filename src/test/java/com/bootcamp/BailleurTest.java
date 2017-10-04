/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.Bailleur;
import jpa.entities.TypeDeBailleur;
import jpa.repositories.BailleurRepository;
import org.testng.annotations.Test;

/**
 *
 * @author Rosius
 */
public class BailleurTest {
    private BailleurRepository mysql = new BailleurRepository("TpJPAPU_mySql");
    private BailleurRepository derby = new BailleurRepository("TpJPAPU");

    @Test
    public void createBailleurMysql() throws SQLException {
        List<Bailleur> bailleurs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Bailleur bailleur = new Bailleur();
            bailleur.setNom(nom[i]);
            bailleur.setTypeDeBailleur(TypeDeBailleur.prive);
            bailleurs.add(bailleur);
        }

        for (Object element : bailleurs) {
            mysql.create((Bailleur) element);
        }

    }

    @Test
    public void createBailleurDerby() throws SQLException {
        List<Bailleur> bailleurs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Bailleur bailleur = new Bailleur();
            bailleur.setNom(nom[i]);
            bailleur.setTypeDeBailleur(TypeDeBailleur.prive);
            bailleurs.add(bailleur);
        }

        for (Object element : bailleurs) {
            derby.create((Bailleur) element);
        }
    }

    @Test
    public void readAllBailleurMysql() throws SQLException {
        mysql.findAll();

    }

    @Test
    public void readAllBailleurDerby() throws SQLException {
        derby.findAll();
    }

    @Test
    public void readBailleurMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    @Test
    public void readBailleurDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    @Test
    public void updateBailleurMysql() throws SQLException {
        Bailleur bailleur = mysql.findByProperty("nom", "Mar");
        bailleur.setNom("TestBailleur");
        mysql.update(bailleur);
    }

    @Test
    public void updateeBailleurDerby() throws SQLException {
        Bailleur bailleur = derby.findByProperty("nom", "Mar");
        bailleur.setNom("TestBailleur");
        derby.update(bailleur);
    }

    @Test
    public void deleteBailleurMysql() throws SQLException {
        Bailleur bailleur = mysql.findByProperty("nom", "Dak");
        mysql.delete(bailleur);
    }

    @Test
    public void deleteBailleurDerby() throws SQLException {
        Bailleur bailleur = derby.findByProperty("nom", "Dak");

        derby.delete(bailleur);
    }

    /**
     * @return the mysql
     */
    public BailleurRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(BailleurRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public BailleurRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(BailleurRepository derby) {
        this.derby = derby;
    }
}
