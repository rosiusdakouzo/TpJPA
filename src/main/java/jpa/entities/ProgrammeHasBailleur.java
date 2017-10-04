/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Rosius
 */
@Entity(name="ProgrammeHasBailleur")
@Table(name="tp_programmeHasBailleur")
public class ProgrammeHasBailleur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programmeHasBailleur")
    private List<Programme> programmes = new ArrayList<Programme>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programmeHasBailleur")
    private List<Bailleur> bailleurs = new ArrayList<Bailleur>();
    
    @NotNull(message="La colonne nombre doit etre non nulle")
    @Column(name="nombre", nullable = false)
    private int nombre;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof ProgrammeHasBailleur)) {
            return false;
        }
        ProgrammeHasBailleur other = (ProgrammeHasBailleur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProgrammeHasBailleur[ id=" + id + " ]";
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
     * @return the bailleurs
     */
    public List<Bailleur> getBailleurs() {
        return bailleurs;
    }

    /**
     * @param bailleurs the bailleurs to set
     */
    public void setBailleurs(List<Bailleur> bailleurs) {
        this.bailleurs = bailleurs;
    }

    /**
     * @return the nombre
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
}
