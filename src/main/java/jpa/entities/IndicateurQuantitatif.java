/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rosius
 */
@Entity
@Table(name="tp_ indicateur_quantitatif")
public class IndicateurQuantitatif implements Serializable {

    //Colonnes
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="nom", length=45, nullable=false)
    private String nom;
    
    @Column(name="propriete", length=45, nullable=false)
    private String propriete;
    
    @Column(nullable=false)
    private Integer valeur;
    
    // Relation
    @ManyToOne
    private IndicateurPerformance indicateurPerformance;
    
    //Getters Setters
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
        if (!(object instanceof IndicateurQuantitatif)) {
            return false;
        }
        IndicateurQuantitatif other = (IndicateurQuantitatif) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.IndicateurQuantitatif[ id=" + id + " ]";
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the propriete
     */
    public String getPropriete() {
        return propriete;
    }

    /**
     * @param propriete the propriete to set
     */
    public void setPropriete(String propriete) {
        this.propriete = propriete;
    }

    /**
     * @return the valeur
     */
    public Integer getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    /**
     * @return the indicateurPerformance
     */
    public IndicateurPerformance getIndicateurPerformance() {
        return indicateurPerformance;
    }

    /**
     * @param indicateurPerformance the indicateurPerformance to set
     */
    public void setIndicateurPerformance(IndicateurPerformance indicateurPerformance) {
        this.indicateurPerformance = indicateurPerformance;
    }
    
}
