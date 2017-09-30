/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Rosius
 */
@Entity
@Table(name = "tp_bailleur")
public class Bailleur implements Serializable {

    //Differentes colonnes (x3)
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nom", length = 45, nullable = false)
    private String nom;

    @Column(name = "typeDeBailleur", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TypeDeBailleur typeDeBailleur;

    //Les differentes relations
    @ManyToMany(mappedBy = "bailleurs")
    private Collection<Programme> programmes;

    @ManyToMany(mappedBy = "bailleurs")
    private Collection<Projet> projets;

    //Constructeur
    //Getters et Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bailleur)) {
            return false;
        }
        Bailleur other = (Bailleur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bailleur[ id=" + id + " ]";
    }

    /**
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param name the name to set
     */
    public void setNom(String nom) /*throws ColumnValueIsNullException */{
       this.nom = nom;
//        throws ColumnValueIsNullException
//                {
//                    if(nom.isEmpty()){
//                        throw new ColumnValueIsNullException();
//                    }
//                    else{
//                        this.nom = nom;
//                    }
//                }
//            try{
//                this.nom = nom;
//            }
//            catch (java.sql.SQLIntegrityConstraintViolationException e){
//                System.out.println("Mon message d'erreur");
//            }
    }

    /**
     * @return the typeDeBailleur0
     */
    public TypeDeBailleur getTypeDeBailleur() {
        return typeDeBailleur;
    }

    /**
     * @param typeDeBailleur the typeDeBailleur to set
     */
    public void setTypeDeBailleur(TypeDeBailleur typeDeBailleur) {
        this.typeDeBailleur = typeDeBailleur;
    }

    /**
     * @return the programmes
     */
    public Collection<Programme> getProgrammes() {
        return programmes;
    }

    /**
     * @param programmes the programmes to set
     */
    public void setProgrammes(Collection<Programme> programmes) {
        this.programmes = programmes;
    }

    /**
     * @return the projets
     */
    public Collection<Projet> getProjets() {
        return projets;
    }

    /**
     * @param projets the projets to set
     */
    public void setProjets(Collection<Projet> projets) {
        this.projets = projets;
    }
}
