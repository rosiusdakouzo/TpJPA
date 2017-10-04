/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Rosius
 */
@Entity(name="Programme")
@Table(name="tp_programme")
public class Programme implements Serializable {

    //Colonnes
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotNull(message="Le champs nom doit etre non nul")
    @Column(name="nom", length=45, nullable=false)
    private String nom;
    
    @NotNull(message="Le champs objectif doit etre non nul")
    @Column(name="objectif", length=45, nullable=false)
    private String objectif;
    
    @NotNull(message="Le champs dateDeDebut doit etre non nul")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeDebut;
    
    @NotNull(message="Le champs dateDeFin doit etre non nul")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeFin;
    
    @NotNull(message="Le champs budgetPrevisionnel doit etre non nul")
    @Column(nullable=false)
    private Integer budgetPrevisionnel;
    
    @NotNull(message="Le champs budgetEffectif doit etre non nul")
    @Column(nullable=false)
    private Integer budgetEffectif;
   
    // Relation
    @OneToMany (cascade=CascadeType.ALL, mappedBy = "programme")
    private List <Projet> projets = new ArrayList<Projet>();
    
    @NotNull(message="Le champs indicateurPerformance doit etre non nul")
    @ManyToOne(fetch=FetchType.LAZY)
    private IndicateurPerformance indicateurPerformance;
    
    @NotNull(message="Le champs programmeHasBailleur doit etre non nul")
    @ManyToOne(fetch=FetchType.LAZY)
    private ProgrammeHasBailleur programmeHasBailleur;
    
    @NotNull(message="Le champs programmeHasFournisseur doit etre non nul")
    @ManyToOne(fetch=FetchType.LAZY)
    private ProgrammeHasFournisseur programmeHasFournisseur;
    
    @NotNull(message="Le champs programmeHasBeneficiaire doit etre non nul")
    @ManyToOne(fetch=FetchType.LAZY)
    private ProgrammeHasBeneficiaire programmeHasBeneficiaire;
    
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
        if (!(object instanceof Programme)) {
            return false;
        }
        Programme other = (Programme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Programme[ id=" + id + " ]";
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
     * @return the objectif
     */
    public String getObjectif() {
        return objectif;
    }

    /**
     * @param objectif the objectif to set
     */
    public void setObjectif(String objectif) {
        this.objectif = objectif;
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
     * @return the dateDeFin
     */
    public Date getDateDeFin() {
        return dateDeFin;
    }

    /**
     * @param dateDeFin the dateDeFin to set
     */
    public void setDateDeFin(Date dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    /**
     * @return the budgetPrevisionnel
     */
    public Integer getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    /**
     * @param budgetPrevisionnel the budgetPrevisionnel to set
     */
    public void setBudgetPrevisionnel(Integer budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    /**
     * @return the budgetEffectif
     */
    public Integer getBudgetEffectif() {
        return budgetEffectif;
    }

    /**
     * @param budgetEffectif the budgetEffectif to set
     */
    public void setBudgetEffectif(Integer budgetEffectif) {
        this.budgetEffectif = budgetEffectif;
    }

    /**
     * @return the projets
     */
    public Collection <Projet> getProjets() {
        return projets;
    }

    
}
