/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.repositories.IndicateurPerformanceRepository;
import org.testng.annotations.Test;
import jpa.entities.*;
import jpa.repositories.*;


/**
 *
 * @author Rosius
 */
public class IndicateurPerformanceTest {

    private IndicateurPerformanceRepository mysql = new IndicateurPerformanceRepository("TpJPAPU_SQL");
    private IndicateurPerformanceRepository derby = new IndicateurPerformanceRepository("TpJPAPU");

    @Test
    public void createIndicateurPerformanceMysql() throws SQLException {
        List<IndicateurPerformance> indicateurPerformances = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurPerformance indicateurPerformance = new IndicateurPerformance();
            indicateurPerformance.setNom(nom[i]);
            indicateurPerformances.add(indicateurPerformance);
        }

        for (Object element : indicateurPerformances) {
            mysql.create((IndicateurPerformance) element);
        }

    }

    @Test
    public void createIndicateurPerformanceDerby() throws SQLException {
        List<IndicateurPerformance> indicateurPerformances = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            IndicateurPerformance indicateurPerformance = new IndicateurPerformance();
            indicateurPerformance.setNom(nom[i]);
            indicateurPerformances.add(indicateurPerformance);
        }

        for (Object element : indicateurPerformances) {
            derby.create((IndicateurPerformance) element);
        }
    }

    @Test
    public void readAllIndicateurPerformanceMysql() throws SQLException {
        mysql.findAll();

    }

    @Test
    public void readAllIndicateurPerformanceDerby() throws SQLException {
        derby.findAll();
    }

    @Test
    public void readIndicateurPerformanceMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    @Test
    public void readIndicateurPerformanceDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    @Test
    public void updateIndicateurPerformanceMysql() throws SQLException {
        IndicateurPerformance indicateurPerformance = mysql.findByProperty("nom", "Mar");
        indicateurPerformance.setNom("IQTest");
        mysql.update(indicateurPerformance);
    }

    @Test
    public void updateeIndicateurPerformanceDerby() throws SQLException {
        IndicateurPerformance indicateurPerformance = derby.findByProperty("nom", "Mar");
        indicateurPerformance.setNom("IQTest");
        derby.update(indicateurPerformance);
    }

    @Test
    public void deleteIndicateurPerformanceMysql() throws SQLException {
        IndicateurPerformance indicateurPerformance = mysql.findByProperty("nom", "Dak");
        mysql.delete(indicateurPerformance);
    }

    @Test
    public void deleteIndicateurPerformanceDerby() throws SQLException {
        IndicateurPerformance indicateurPerformance = derby.findByProperty("nom", "Dak");

        derby.delete(indicateurPerformance);
    }

    /**
     * @return the mysql
     */
    public IndicateurPerformanceRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(IndicateurPerformanceRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public IndicateurPerformanceRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(IndicateurPerformanceRepository derby) {
        this.derby = derby;
    }
}
