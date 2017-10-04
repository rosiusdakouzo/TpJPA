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
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rosius
 */
@Entity
@Table(name="tp_fournisseur")
@DiscriminatorValue("TP_FOURNISSEUR")
public class Fournisseur extends Personne {
    
    @NotNull(message="Le champs programmeFournisseur doit etre non nul")
    //Relations
    @ManyToOne(fetch=FetchType.LAZY)
    private ProgrammeHasFournisseur programmeHasFournisseur;
    
    @ManyToMmany(mappedBy="fournisseurs")
    private List<Projet> projets = new ArrayList<Projet>();

    /**
     * @return the programmeHasFournisseur
     */
    public ProgrammeHasFournisseur getProgrammeHasFournisseur() {
        return programmeHasFournisseur;
    }

    /**
     * @param programmeHasFournisseur the programmeHasFournisseur to set
     */
    public void setProgrammeHasFournisseur(ProgrammeHasFournisseur programmeHasFournisseur) {
        this.programmeHasFournisseur = programmeHasFournisseur;
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
    
    
}
