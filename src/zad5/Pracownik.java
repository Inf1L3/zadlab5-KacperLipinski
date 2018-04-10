/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Pracownik {
public String imie;      
public String nazwisko;  
public int wiek;
public String stanowisko;



public Pracownik( String imie, String nazwisko, int wiek, String stanowisko) {
this.imie = imie;
this.nazwisko = nazwisko;
this.wiek = wiek;
this.stanowisko = stanowisko;
}

        
 public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("stanowisko: " + this.stanowisko);
    }
}
