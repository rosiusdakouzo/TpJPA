/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.IndicateurQualitatif;



/**
 *
 * @author Rosius
 */
public class IndicateurQualitatifRepository extends BaseRepository<IndicateurQualitatif> {

    public IndicateurQualitatifRepository(String UnitPersistence) {
        super(UnitPersistence, IndicateurQualitatif.class);
    }
}
