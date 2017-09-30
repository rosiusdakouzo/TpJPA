/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;
/**
 *
 * @author Rosius
 */
public enum TypeDeBailleur {
     gouvernementales ("Gouvernementales"),
     prive ("Prive"),
     gouvernement ("Gouvernement"),
     partenaireInternational ("Partenaire International");
    
     private String type="";

    private TypeDeBailleur(String type) {
        this.type=type;
    }
     
     public String toString(){
         return type;
     }
}
