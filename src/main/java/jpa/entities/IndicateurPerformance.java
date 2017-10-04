/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;
/**
 *
 * @author Rosius
 */
@Entity
@Table(name="tp_Indicateur_Performance")
public class IndicateurPerformance implements Serializable {

    //Colonnes
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotNull(message="La colonne nom doit etre non nul")
    @Column(name="nom", length=45, nullable=false)
    private String nom;
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private List<Programme> programmes = new ArrayList<Programme>();
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private List<Projet> projets = new ArrayList<Projet>();
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private List<Livrable> livrables = new ArrayList<Livrable>();
    
    @OneToMany (cascade=CascadeType.ALL, mappedBy = "indicateurPerformance")
    private List<IndicateurQualitatif> indicateurQualitatif = new ArrayList<IndicateurQualitatif>();
    
    @OneToMany (cascade=CascadeType.ALL, mappedBy = "indicateurPerformance")
    private List<IndicateurQuantitatif> indicateurQuantitatif = new ArrayList<IndicateurQuantitatif>();
    
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
        if (!(object instanceof IndicateurPerformance)) {
            return false;
        }
        IndicateurPerformance other = (IndicateurPerformance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.IndicateurPerformance[ id=" + id + " ]";
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
     * @return the programmes
     */
    public List<Programme> getProgrammes() {
        return programmes;
    }

    /**
     * @param programmes the programmes to set
     */
    public void setProgrammes(List<Programme> programmes) {
        this.programmes = programmes;
    }

    /**
     * @return the projets
     */
    public List<Projet> getProjets() {
        return projets;
    }

    /**
     * @param projets the projets to set
     */
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    /**
     * @return the livrables
     */
    public List<Livrable> getLivrables() {
        return livrables;
    }

    /**
     * @param livrables the livrables to set
     */
    public void setLivrables(List<Livrable> livrables) {
        this.livrables = livrables;
    }

    /**
     * @return the indicateurQualitatif
     */
    public List<IndicateurQualitatif> getIndicateurQualitatif() {
        return indicateurQualitatif;
    }

    /**
     * @param indicateurQualitatif the indicateurQualitatif to set
     */
    public void setIndicateurQualitatif(List<IndicateurQualitatif> indicateurQualitatif) {
        this.indicateurQualitatif = indicateurQualitatif;
    }

    /**
     * @return the indicateurQuantitatif
     */
    public List<IndicateurQuantitatif> getIndicateurQuantitatif() {
        return indicateurQuantitatif;
    }

    /**
     * @param indicateurQuantitatif the indicateurQuantitatif to set
     */
    public void setIndicateurQuantitatif(List<IndicateurQuantitatif> indicateurQuantitatif) {
        this.indicateurQuantitatif = indicateurQuantitatif;
    }
    
}
