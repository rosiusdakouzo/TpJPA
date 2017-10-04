/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.IndicateurQualitatif;
import jpa.repositories.IndicateurQualitatifRepository;
import org.testng.annotations.Test;

/**
 *
 * @author Rosius
 */
public class IndicateurQualitatifTest {

    private IndicateurQualitatifRepository mysql = new IndicateurQualitatifRepository("TpJPAPU_SQL");
    private IndicateurQualitatifRepository derby = new IndicateurQualitatifRepository("TpJPAPU");

    @Test
    public void createIndicateurQualitatifMysql() throws SQLException {
        List<IndicateurQualitatif> indicateurQualitatifs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String propriete[] = {"Mar", "Dak", "Ros"};
        String valeur[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurQualitatif indicateurQualitatif = new IndicateurQualitatif();
            indicateurQualitatif.setNom(nom[i]);
            indicateurQualitatif.setPropriete(propriete[i]);
            indicateurQualitatif.setValeur(valeur[i]);
            indicateurQualitatifs.add(indicateurQualitatif);
        }

        for (Object element : indicateurQualitatifs) {
            mysql.create((IndicateurQualitatif) element);
        }

    }

    @Test
    public void createIndicateurQualitatifDerby() throws SQLException {
        List<IndicateurQualitatif> indicateurQualitatifs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String propriete[] = {"Mar", "Dak", "Ros"};
        String valeur[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurQualitatif indicateurQualitatif = new IndicateurQualitatif();
            indicateurQualitatif.setNom(nom[i]);
            indicateurQualitatif.setPropriete(propriete[i]);
            indicateurQualitatif.setValeur(valeur[i]);
            indicateurQualitatifs.add(indicateurQualitatif);
        }

        for (Object element : indicateurQualitatifs) {
            derby.create((IndicateurQualitatif) element);
        }
    }

    @Test
    public void readAllIndicateurQualitatifMysql() throws SQLException {
        mysql.findAll();

    }

    @Test
    public void readAllIndicateurQualitatifDerby() throws SQLException {
        derby.findAll();
    }

    @Test
    public void readIndicateurQualitatifMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    @Test
    public void readIndicateurQualitatifDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    @Test
    public void updateIndicateurQualitatifMysql() throws SQLException {
        IndicateurQualitatif indicateurQualitatif = mysql.findByProperty("nom", "Mar");
        indicateurQualitatif.setNom("IQTest");
        mysql.update(indicateurQualitatif);
    }

    @Test
    public void updateeIndicateurQualitatifDerby() throws SQLException {
        IndicateurQualitatif indicateurQualitatif = derby.findByProperty("nom", "Mar");
        indicateurQualitatif.setNom("IQTest");
        derby.update(indicateurQualitatif);
    }

    @Test
    public void deleteIndicateurQualitatifMysql() throws SQLException {
        IndicateurQualitatif indicateurQualitatif = mysql.findByProperty("nom", "Dak");
        mysql.delete(indicateurQualitatif);
    }

    @Test
    public void deleteIndicateurQualitatifDerby() throws SQLException {
        IndicateurQualitatif indicateurQualitatif = derby.findByProperty("nom", "Dak");

        derby.delete(indicateurQualitatif);
    }

    /**
     * @return the mysql
     */
    public IndicateurQualitatifRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(IndicateurQualitatifRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public IndicateurQualitatifRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(IndicateurQualitatifRepository derby) {
        this.derby = derby;
    }
}
