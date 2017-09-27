/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjpa;

import dataProvider.BailleurProvider;
import dataProvider.BeneficiaireProvider;
import dataProvider.FournisseurProvider;
import entities.Bailleur;
import entities.Beneficiaire;
import entities.Fournisseur;
import entities.TypeDeBailleur;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import repositories.BailleurRepository;
import repositories.BeneficiaireRepository;
import repositories.FournisseurRepository;

/**
 *
 * @author Rosius
 */
public class TpJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TpJPAPU") ;

        EntityManager em = emf.createEntityManager() ;

//        Bailleur bailleur =  new Bailleur() ;
//        bailleur.setNom("Nom");
//        bailleur.setTypeDeBailleur(TypeDeBailleur.partenaireInternational);
//        em.getTransaction().begin() ;
//        em.persist(bailleur) ;
//        em.getTransaction().commit() ;
//        System.out.println("Id = " + bailleur.getId()) ;
//        
        //Bailleur
        BailleurProvider bp = new BailleurProvider();
        bp.provide(em);

        BailleurRepository br = new BailleurRepository();
        List<Bailleur> result = br.findAll(em);

        for (Object element : result) {
            Bailleur nameBean = (Bailleur) element;
            System.out.println(nameBean.getNom() + " " + nameBean.getTypeDeBailleur());
        }
        
        //Fournisseur
        FournisseurProvider fp = new FournisseurProvider();
        fp.provide(em);

        FournisseurRepository fr = new FournisseurRepository();
        List<Fournisseur> result1 = fr.findAll(em);

        for (Object element1 : result1) {
            Fournisseur nameBean = (Fournisseur) element1;
            System.out.println(nameBean.getNom());
        }
        
        //Beneficiaire
        BeneficiaireProvider benp = new BeneficiaireProvider();
        benp.provide(em);

        BeneficiaireRepository benr = new BeneficiaireRepository();
        List<Beneficiaire> result2 = benr.findAll(em);

        for (Object element2 : result2) {
            Beneficiaire nameBean = (Beneficiaire) element2;
            System.out.println(nameBean.getNom());
        }

    }    
}
