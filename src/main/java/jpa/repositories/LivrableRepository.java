/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.Livrable;



/**
 *
 * @author Rosius
 */
public class LivrableRepository extends BaseRepository<Livrable> {

    public LivrableRepository(String UnitPersistence) {
        super(UnitPersistence, Livrable.class);
    }
}
