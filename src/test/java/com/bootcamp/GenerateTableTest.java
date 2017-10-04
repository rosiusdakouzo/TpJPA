/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.util.Properties;
import org.testng.annotations.Test;
import javax.persistence.*;

/**
 *
 * @author Rosius
 */
public class GenerateTableTest {

    @Test
    public void generateTablesMysql() {
        Persistence.generateSchema("TpJPAPU", new Properties());
    }

    @Test
    public void generateTablesDerby() {
        Persistence.generateSchema("TpJPAPU_SQL", new Properties());
    }
}
