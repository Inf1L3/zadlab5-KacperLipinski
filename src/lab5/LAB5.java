/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int wybor;    
    Scanner skan = new Scanner(System.in);        
    System.out.println("Podaj wielkość stosu");
    int rozmiar = skan.nextInt();
    KLASA5 KLASA5 = new KLASA5(rozmiar);
    

    
    do{
    System.out.println("1.Dodaj do stosu \n"+"2.Zabierz ze stosu \n"+"3.Pokaż stos \n"+"4.Zamknij program \n");
    wybor = skan.nextInt();
    switch(wybor){
    case 1: KLASA5.push(); 
    case 2: KLASA5.pop();
    case 3: KLASA5.pokaz(); 
    }
    }while(wybor!=4);
    
    
    }
    
}
