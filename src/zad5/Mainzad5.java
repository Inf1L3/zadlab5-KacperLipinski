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
public class Mainzad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int wybor;    
    Scanner skan = new Scanner(System.in);
    Firma firma = new Firma();
    firma.Firma();
    do{
    System.out.println("1.Dodaj pracownika \n"+"2.Usun pracownika \n"+"3.Pokaż liste \n"+"4.Zamknij program \n");
    wybor = skan.nextInt();
    switch(wybor){
    case 1: firma.dodaj();break; 
    case 2: firma.usun();break;
    case 3: firma.wyswietl(); break;
    }
    }while(wybor!=4);
    }
    
}
