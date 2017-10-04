/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.Beneficiaire;
import jpa.repositories.BeneficiaireRepository;
import org.testng.annotations.Test;

/**
 *
 * @author Rosius
 */
public class BeneficiaireTest {

    private BeneficiaireRepository mysql = new BeneficiaireRepository("TpJPAPU_SQL");
    private BeneficiaireRepository derby = new BeneficiaireRepository("TpJPAPU");

    @Test
    public void createBeneficiaireMysql() throws SQLException {
        List<Beneficiaire> beneficiaires = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Beneficiaire beneficiaire = new Beneficiaire();
            beneficiaire.setNom(nom[i]);
            beneficiaires.add(beneficiaire);
        }

        for (Object element : beneficiaires) {
            mysql.create((Beneficiaire) element);
        }

    }

    @Test
    public void createBeneficiaireDerby() throws SQLException {
        List<Beneficiaire> beneficiaires = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Beneficiaire beneficiaire = new Beneficiaire();
            beneficiaire.setNom(nom[i]);
            beneficiaires.add(beneficiaire);
        }

        for (Object element : beneficiaires) {
            derby.create((Beneficiaire) element);
        }
    }

    @Test
    public void readAllBeneficiaireMysql() throws SQLException {
        mysql.findAll();

    }

    @Test
    public void readAllBeneficiaireDerby() throws SQLException {
        derby.findAll();
    }

    @Test
    public void readBeneficiaireMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    @Test
    public void readBeneficiaireDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    @Test
    public void updateBeneficiaireMysql() throws SQLException {
        Beneficiaire beneficiaire = mysql.findByProperty("nom", "Mar");
        beneficiaire.setNom("BenTest");
        mysql.update(beneficiaire);
    }

    @Test
    public void updateeBeneficiaireDerby() throws SQLException {
        Beneficiaire beneficiaire = derby.findByProperty("nom", "Mar");
        beneficiaire.setNom("BenTest");
        derby.update(beneficiaire);
    }

    @Test
    public void deleteBeneficiaireMysql() throws SQLException {
        Beneficiaire beneficiaire = mysql.findByProperty("nom", "Dak");
        mysql.delete(beneficiaire);
    }

    @Test
    public void deleteBeneficiaireDerby() throws SQLException {
        Beneficiaire beneficiaire = derby.findByProperty("nom", "Dak");

        derby.delete(beneficiaire);
    }

    /**
     * @return the mysql
     */
    public BeneficiaireRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(BeneficiaireRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public BeneficiaireRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(BeneficiaireRepository derby) {
        this.derby = derby;
    }
}
