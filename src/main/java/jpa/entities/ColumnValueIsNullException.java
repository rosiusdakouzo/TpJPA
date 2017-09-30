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
class ColumnValueIsNullException extends Exception{
    public ColumnValueIsNullException(){
        System.out.println("La valeur de la propriete renseignee ne doit pas etre nulle !");
    }
}
