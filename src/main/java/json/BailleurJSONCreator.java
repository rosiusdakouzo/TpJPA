/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import jpa.entities.Bailleur;
import jpa.entities.TypeDeBailleur;
//import jpa.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author Rosius
 */
public class BailleurJSONCreator {
    public void BailleurJSONCreator() throws IOException {
        List<Bailleur> bailleurs = new LinkedList();

        String nom[] = {"Ros", "DAK", "Mar"};
        for (int i = 0; i < nom.length; i++) {
            Bailleur bailleur = new Bailleur();
            bailleur.setNom(nom[i]);
            bailleur.setTypeDeBailleur(TypeDeBailleur.prive);
            bailleurs.add(bailleur);
        }

        ObjectMapper mapper = new ObjectMapper();
        File bailleurFile = new File("bailleur.json");

        for (Object element : bailleurs) {
            mapper.writeValue(bailleurFile, element);
        }
    }
}
