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
public class Firma {
private Pracownik lista[] = new Pracownik[100];
Scanner skan = new Scanner(System.in);

public void Firma() {
        for (int i = 0; i < 100; i++) {
            lista[i] = new Pracownik(" ", " ", 0, " ");
        }
}
        public void dodaj(){
        System.out.println("Ktora pozycja?: ");
        int indeks1 = skan.nextInt();
        System.out.println("Imie: ");
        String imie1 = skan.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko1 = skan.nextLine();
        System.out.println("Wiek: ");
        int wiek1 = skan.nextInt();
        System.out.println("Stanowisko : ");
        String stanowisko1 = skan.nextLine();
        lista[indeks1] = new Pracownik(imie1, nazwisko1, wiek1, stanowisko1);
    }

    public void usun() {
        System.out.println("Ktora pozycja?: ");
        int indeks1 = skan.nextInt();
        if (indeks1 >= 0 && indeks1 < 100) {
            lista[indeks1] = new Pracownik(" ", " ", 0, " ");
        }
    }

    public void wyswietl() {
        for (int i = 0; i < 100; i++) {
            lista[i].pokazDane();
        }
}
}