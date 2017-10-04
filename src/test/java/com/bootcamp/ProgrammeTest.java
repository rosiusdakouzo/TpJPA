/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.Programme;
import jpa.repositories.ProgrammeRepository;

/**
 *
 * @author Rosius
 */
public class ProgrammeTest {

    private ProgrammeRepository mysql = new ProgrammeRepository("TpJPAPU");
    private ProgrammeRepository derby = new ProgrammeRepository("TpJPAPU");

    //@Test
    public void createProgrammeMysql() throws SQLException {
        List<Programme> programmes = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String objectif[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Programme programme = new Programme();
            programme.setNom(nom[i]);
            programme.setObjectif(objectif[i]);
            programme.setDateDeDebut(Date.from(Instant.MIN));
            programme.setDateDeFin(Date.from(Instant.MIN));
            programme.setBudgetEffectif(1220);
            programme.setBudgetPrevisionnel(1220);
            programme.setNom(nom[i]);
            programmes.add(programme);
        }

        for (Object element : programmes) {
            mysql.create((Programme) element);
        }

    }

    //@Test
    public void createProgrammeDerby() throws SQLException {
        List<Programme> programmes = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        String objectif[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Programme programme = new Programme();
            programme.setNom(nom[i]);
            programme.setObjectif(objectif[i]);
            programme.setDateDeDebut(Date.from(Instant.MIN));
            programme.setDateDeFin(Date.from(Instant.MIN));
            programme.setBudgetEffectif(1220);
            programme.setBudgetPrevisionnel(1220);
            programme.setNom(nom[i]);
            programmes.add(programme);
        }

        for (Object element : programmes) {
            derby.create((Programme) element);
        }
    }

    //@Test
    public void readAllProgrammeMysql() throws SQLException {
        mysql.findAll();

    }

    //@Test
    public void readAllProgrammeDerby() throws SQLException {
        derby.findAll();
    }

    //@Test
    public void readProgrammeMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    //@Test
    public void readProgrammeDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    //@Test
    public void updateProgrammeMysql() throws SQLException {
        Programme programme = mysql.findByProperty("nom", "Mar");
        programme.setNom("PgTest");
        mysql.update(programme);
    }

    //@Test
    public void updateeProgrammeDerby() throws SQLException {
        Programme programme = derby.findByProperty("nom", "Mar");
        programme.setNom("PgTest");
        derby.update(programme);
    }

    //@Test
    public void deleteProgrammeMysql() throws SQLException {
        Programme programme = mysql.findByProperty("nom", "Dak");
        mysql.delete(programme);
    }

    //@Test
    public void deleteProgrammeDerby() throws SQLException {
        Programme programme = derby.findByProperty("nom", "Dak");

        derby.delete(programme);
    }

    /**
     * @return the mysql
     */
    public ProgrammeRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(ProgrammeRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public ProgrammeRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(ProgrammeRepository derby) {
        this.derby = derby;
    }
}
