/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.Bailleur;



/**
 *
 * @author Rosius
 */
public class BailleurRepository extends BaseRepository<Bailleur> {

    public BailleurRepository(String unitPersistence) {
        super(unitPersistence, Bailleur.class);
    }
}
