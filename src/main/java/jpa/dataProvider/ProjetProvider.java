/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataProvider;

import java.util.LinkedList;
import repositories.*;
import java.util.List;
import javax.persistence.EntityManager;
import entities.Fournisseur;

/**
 *
 * @author Rosius
 */
public class ProjetProvider {
        public void provide(EntityManager manager) {
        List<Fournisseur> fournisseurs = new LinkedList();

        String nom[] = {"Proj1", "Proj2", "Proj3"};
        for (int i = 0; i < nom.length; i++) {
            Fournisseur fournisseur = new Fournisseur();
            fournisseur.setNom(nom[i]);
            fournisseurs.add(fournisseur);
        }

        for (Object element : fournisseurs) {
            FournisseurRepository br = new FournisseurRepository();
            br.addFournisseur(manager, (Fournisseur) element);
        }

    }
}
