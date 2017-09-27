/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
    
    @Column(name="libelle", length=45, nullable=false)
    private String libelle;
    
    @Column(name="nature", length=45, nullable=false)
    private String nature;
    
    @Column(name="valeur", length=45, nullable=false)
    private String valeur;
        
    //Relations
    @OneToMany (mappedBy = "indicateurPerformance")
    private Collection <Programme> programmes;
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private Collection <Projet> projets;
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private Collection <Livrable> livrables;
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private Collection <IndicateurQualitatif> indicateurQualitatif;
    
    @OneToMany (mappedBy = "indicateurPerformance")
    private Collection <IndicateurQuantitatif> indicateurQuantitatif;
    
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
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(String nature) {
        this.nature = nature;
    }

    /**
     * @return the valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    /**
     * @return the programmes
     */
    public Collection <Programme> getProgrammes() {
        return programmes;
    }

    /**
     * @param programmes the programmes to set
     */
    public void setProgrammes(Collection <Programme> programmes) {
        this.programmes = programmes;
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
     * @return the livrables
     */
    public Collection <Livrable> getLivrables() {
        return livrables;
    }

    /**
     * @param livrables the livrables to set
     */
    public void setLivrables(Collection <Livrable> livrables) {
        this.livrables = livrables;
    }

    /**
     * @return the indicateurQualitatif
     */
    public Collection <IndicateurQualitatif> getIndicateurQualitatif() {
        return indicateurQualitatif;
    }

    /**
     * @param indicateurQualitatif the indicateurQualitatif to set
     */
    public void setIndicateurQualitatif(Collection <IndicateurQualitatif> indicateurQualitatif) {
        this.indicateurQualitatif = indicateurQualitatif;
    }

    /**
     * @return the indicateurQuantitatif
     */
    public Collection <IndicateurQuantitatif> getIndicateurQuantitatif() {
        return indicateurQuantitatif;
    }

    /**
     * @param indicateurQuantitatif the indicateurQuantitatif to set
     */
    public void setIndicateurQuantitatif(Collection <IndicateurQuantitatif> indicateurQuantitatif) {
        this.indicateurQuantitatif = indicateurQuantitatif;
    }
    
}
