/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.Fournisseur;

/**
 *
 * @author Rosius
 */
public class FournisseurRepository extends BaseRepository<Fournisseur> {

    public FournisseurRepository(String UnitPersistence) {
        super(UnitPersistence, Fournisseur.class);
    }
}
