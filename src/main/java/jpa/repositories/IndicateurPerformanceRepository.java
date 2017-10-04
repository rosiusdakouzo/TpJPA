/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;

import jpa.entities.IndicateurPerformance;

/**
 *
 * @author Rosius
 */
public class IndicateurPerformanceRepository extends BaseRepository<IndicateurPerformance> {

    public IndicateurPerformanceRepository(String UnitPersistence) {
        super(UnitPersistence, IndicateurPerformance.class);
    }
}
