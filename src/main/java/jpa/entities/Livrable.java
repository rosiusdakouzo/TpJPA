/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Rosius
 */
@Entity(name="Livrable")
@Table(name="tp_livrable")
public class Livrable implements Serializable {

    //Colonnes
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotNull(message="Le champs nom doit etre non nul")
    @Column(name="nom", length=45, nullable=false)
    private String nom;
    
    @NotNull(message="Le champs dateDebut doit etre non nul")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeDebut;
    
    @NotNull(message="Le champs dateDeLivraison doit etre non nul")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeLivraison;
    
    // Relation
    @NotNull(message="Le champs indicateurPerformance doit etre non nul")
    @ManyToOne
    private IndicateurPerformance indicateurPerformance;
    
    @ManyToOne
    @NotNull(message="Le champs projet doit etre non nul")
    @JoinColumn(name="projet", referencedColumnName="id")
    private Projet projet;
    
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
        if (!(object instanceof Livrable)) {
            return false;
        }
        Livrable other = (Livrable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Livrable[ id=" + id + " ]";
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
     * @return the dateDeDebut
     */
    public Date getDateDeDebut() {
        return dateDeDebut;
    }

    /**
     * @param dateDeDebut the dateDeDebut to set
     */
    public void setDateDeDebut(Date dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    /**
     * @return the dateDeLivraison
     */
    public Date getDateDeLivraison() {
        return dateDeLivraison;
    }

    /**
     * @param dateDeLivraison the dateDeLivraison to set
     */
    public void setDateDeLivraison(Date dateDeLivraison) {
        this.dateDeLivraison = dateDeLivraison;
    }

    /**
     * @return the projet
     */
    public Projet getProjet() {
        return projet;
    }

    /**
     * @param projet the projet to set
     */
    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    
}
