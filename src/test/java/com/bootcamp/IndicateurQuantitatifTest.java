/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.IndicateurQuantitatif;
import jpa.repositories.IndicateurQuantitatifRepository;
import org.testng.annotations.Test;

/**
 *
 * @author Rosius
 */
public class IndicateurQuantitatifTest {

    private IndicateurQuantitatifRepository mysql = new IndicateurQuantitatifRepository("TpJPAPU_SQL");
    private IndicateurQuantitatifRepository derby = new IndicateurQuantitatifRepository("TpJPAPU");

    @Test
    public void createIndicateurQuantitatifMysql() throws SQLException {
        List<IndicateurQuantitatif> indicateurQuantitatifs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String propriete[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurQuantitatif indicateurQuantitatif = new IndicateurQuantitatif();
            indicateurQuantitatif.setNom(nom[i]);
            indicateurQuantitatif.setPropriete(propriete[i]);
            indicateurQuantitatif.setValeur(12);
            indicateurQuantitatifs.add(indicateurQuantitatif);
        }

        for (Object element : indicateurQuantitatifs) {
            mysql.create((IndicateurQuantitatif) element);
        }

    }

    @Test
    public void createIndicateurQuantitatifDerby() throws SQLException {
        List<IndicateurQuantitatif> indicateurQuantitatifs = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String propriete[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurQuantitatif indicateurQuantitatif = new IndicateurQuantitatif();
            indicateurQuantitatif.setNom(nom[i]);
            indicateurQuantitatif.setPropriete(propriete[i]);
            indicateurQuantitatif.setValeur(12);
            indicateurQuantitatifs.add(indicateurQuantitatif);
        }

        for (Object element : indicateurQuantitatifs) {
            derby.create((IndicateurQuantitatif) element);
        }
    }

    //@Test
    public void readAllIndicateurQuantitatifMysql() throws SQLException {
        mysql.findAll();

    }

    //@Test
    public void readAllIndicateurQuantitatifDerby() throws SQLException {
        derby.findAll();
    }

    //@Test
    public void readIndicateurQuantitatifMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    //@Test
    public void readIndicateurQuantitatifDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    //@Test
    public void updateIndicateurQuantitatifMysql() throws SQLException {
        IndicateurQuantitatif indicateurQuantitatif = mysql.findByProperty("nom", "Mar");
        indicateurQuantitatif.setNom("IQuTest");
        mysql.update(indicateurQuantitatif);
    }

    //@Test
    public void updateeIndicateurQuantitatifDerby() throws SQLException {
        IndicateurQuantitatif indicateurQuantitatif = derby.findByProperty("nom", "Mar");
        indicateurQuantitatif.setNom("IQuTest");
        derby.update(indicateurQuantitatif);
    }

    //@Test
    public void deleteIndicateurQuantitatifMysql() throws SQLException {
        IndicateurQuantitatif indicateurQuantitatif = mysql.findByProperty("nom", "Dak");
        mysql.delete(indicateurQuantitatif);
    }

    //@Test
    public void deleteIndicateurQuantitatifDerby() throws SQLException {
        IndicateurQuantitatif indicateurQuantitatif = derby.findByProperty("nom", "Dak");

        derby.delete(indicateurQuantitatif);
    }

    /**
     * @return the mysql
     */
    public IndicateurQuantitatifRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(IndicateurQuantitatifRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public IndicateurQuantitatifRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(IndicateurQuantitatifRepository derby) {
        this.derby = derby;
    }
}
