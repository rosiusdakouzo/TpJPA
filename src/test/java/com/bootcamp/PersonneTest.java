/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.Personne;
import jpa.repositories.PersonneRepository;

/**
 *
 * @author Rosius
 */
public class PersonneTest {

    private PersonneRepository mysql = new PersonneRepository("TpJPAPU_SQL");
    private PersonneRepository derby = new PersonneRepository("TpJPAPU");

    //@Test
    public void createPersonneMysql() throws SQLException {
        List<Personne> personnes = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Personne personne = new Personne();
            personne.setNom(nom[i]);
            personnes.add(personne);
        }

        for (Object element : personnes) {
            mysql.create((Personne) element);
        }

    }

    //@Test
    public void createPersonneDerby() throws SQLException {
        List<Personne> personnes = new LinkedList();

        String nom[] = {"Mar", "Dak", "Ros"};
        for (int i = 0; i < nom.length; i++) {
            Personne personne = new Personne();
            personne.setNom(nom[i]);
            personnes.add(personne);
        }

        for (Object element : personnes) {
            derby.create((Personne) element);
        }
    }

    //@Test
    public void readAllPersonneMysql() throws SQLException {
        mysql.findAll();

    }

    //@Test
    public void readAllPersonneDerby() throws SQLException {
        derby.findAll();
    }

    //@Test
    public void readPersonneMysql() throws SQLException {
        mysql.findByProperty("nom", "Mar");

    }

    //@Test
    public void readPersonneDerby() throws SQLException {
        derby.findByProperty("nom", "Mar");
    }

    //@Test
    public void updatePersonneMysql() throws SQLException {
        Personne personne = mysql.findByProperty("nom", "Mar");
        personne.setNom("PerTest");
        mysql.update(personne);
    }

    //@Test
    public void updateePersonneDerby() throws SQLException {
        Personne personne = derby.findByProperty("nom", "Mar");
        personne.setNom("PerTest");
        derby.update(personne);
    }

    //@Test
    public void deletePersonneMysql() throws SQLException {
        Personne personne = mysql.findByProperty("nom", "Dak");
        mysql.delete(personne);
    }

    //@Test
    public void deletePersonneDerby() throws SQLException {
        Personne personne = derby.findByProperty("nom", "Dak");

        derby.delete(personne);
    }

    /**
     * @return the mysql
     */
    public PersonneRepository getMysql() {
        return this.mysql;
    }

    /**
     * @param mysql the mysql to set
     */
    public void setMysql(PersonneRepository mysql) {
        this.mysql = mysql;
    }

    /**
     * @return the derby
     */
    public PersonneRepository getDerby() {
        return this.derby;
    }

    /**
     * @param derby the derby to set
     */
    public void setDerby(PersonneRepository derby) {
        this.derby = derby;
    }
}
