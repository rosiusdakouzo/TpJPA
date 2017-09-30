/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rosius
 */
@Entity
@Table(name="tp_programme")
public class Programme implements Serializable {

    //Colonnes
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="nom", length=45, nullable=false)
    private String nom;
    
    @Column(name="objectif", length=45, nullable=false)
    private String objectif;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeDebut;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dateDeFin;
    
    @Column(nullable=false)
    private Integer budgetPrevisionnel;
    
    @Column(nullable=false)
    private Integer budgetEffectif;
   
    // Relation
    @OneToMany (mappedBy = "programme")
    private Collection <Projet> projets;
    
    @ManyToOne
    private IndicateurPerformance indicateurPerformance;
    
    @ManyToMany
    private Collection <Fournisseur> fournisseurs;
    
    @ManyToMany
    private Collection <Bailleur> bailleurs;
    
    @ManyToMany
    private Collection <Beneficiaire> beneficiaires;
    
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

    /**
     * @param projets the projets to set
     */
    public void setProjets(Collection <Projet> projets) {
        this.projets = projets;
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
     * @return the fournisseurs
     */
    public Collection <Fournisseur> getFournisseurs() {
        return fournisseurs;
    }

    /**
     * @param fournisseurs the fournisseurs to set
     */
    public void setFournisseurs(Collection <Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }

    /**
     * @return the bailleurs
     */
    public Collection <Bailleur> getBailleurs() {
        return bailleurs;
    }

    /**
     * @param bailleurs the bailleurs to set
     */
    public void setBailleurs(Collection <Bailleur> bailleurs) {
        this.bailleurs = bailleurs;
    }

    /**
     * @return the beneficiaires
     */
    public Collection <Beneficiaire> getBeneficiaires() {
        return beneficiaires;
    }

    /**
     * @param beneficiaires the beneficiaires to set
     */
    public void setBeneficiaires(Collection <Beneficiaire> beneficiaires) {
        this.beneficiaires = beneficiaires;
    }
    
}
