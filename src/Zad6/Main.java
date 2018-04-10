/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad6;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int wybor;
     Scanner skan = new Scanner(System.in);
     System.out.println("Podaj liczbe");
     int n = skan.nextInt();
     Liczba liczba = new Liczba(n);
     
     do{
    System.out.println("1.Wpisz \n"+"2.Wypisz \n"+"3.Mnożenie \n"+"4.Silnia \n"+"5.Zamknij program \n");
    wybor = skan.nextInt();
    switch(wybor){
    case 1: liczba.wpisz();
    case 2: liczba.wypisz();
    case 3: System.out.println("Pomnoz przez: ");
    n = skan.nextInt();    
    liczba.pomnoz(n);
    case 4:
    System.out.println("Silnia: ");
    n = skan.nextInt();
    liczba.silnia(n);
    }
    }while(wybor!=5);
    
    }
    
}
