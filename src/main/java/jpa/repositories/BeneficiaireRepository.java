/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.Beneficiaire;

/**
 *
 * @author Rosius
 */
public class BeneficiaireRepository extends BaseRepository<Beneficiaire> {

    public BeneficiaireRepository(String unitPersistence) {
        super(unitPersistence, Beneficiaire.class);
    }

}
