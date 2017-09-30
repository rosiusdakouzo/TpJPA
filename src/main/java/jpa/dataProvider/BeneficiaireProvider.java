/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.dataProvider;

import entities.Bailleur;
import javax.persistence.EntityManager;
import java.util.LinkedList;
import repositories.*;
import java.util.List;
import entities.*;

/**
 *
 * @author Rosius
 */
public class BeneficiaireProvider {
    public void provide(EntityManager manager) {
        List<Bailleur> bailleurs = new LinkedList();

        String nom[] = {"Rosius", "IsoDos", "Marinic"};
        for (int i = 0; i < nom.length; i++) {
            Bailleur bailleur = new Bailleur();
            bailleur.setNom(nom[i]);
            bailleur.setTypeDeBailleur(TypeDeBailleur.gouvernement);
            bailleurs.add(bailleur);
        }

        for (Object element : bailleurs) {
            BailleurRepository br = new BailleurRepository();
            br.addBailleur(manager, (Bailleur) element);
        }

    }
}
