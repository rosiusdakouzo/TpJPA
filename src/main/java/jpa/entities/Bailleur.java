/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rosius
 */
@Entity
@Table(name = "tp_bailleur")
@DiscriminatorValue("TP_BAILLEUR")
@NamedQueries({
    @NamedQuery(
        name="Bailleur.findAll",
            query="select bailleur from Bailleur bailleur"),
    @NamedQuery(
        name="Bailleur.findByName",
            query="select bailleur from Bailleur bailleur where bailleur.nom = :nom"),
    @NamedQuery(
        name="Bailleur.countAll",
            query="select count(bailleur) from Baialleur bailleur"),
})
public class Bailleur extends Personne {
    
    @NotNull(message="Le champs typeDeBailleur doit etre non null")
    @Column(name = "typeDeBailleur", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TypeDeBailleur typeDeBailleur;

    //Les differentes relations
    @ManyToMany(mappedBy = "bailleurs")
    private Collection<Programme> programmes;

    @ManyToMany(mappedBy = "bailleurs")
    private Collection<Projet> projets;

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
