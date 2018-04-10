/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Liczba {
int liczbatab[] = new int[100];
public int liczba;
public int dlugosc;
Scanner skan = new Scanner(System.in);

public Liczba(int n) {
        dlugosc=Integer.toString(n).length();
        for(int i=0;i<dlugosc;i++){
        liczbatab[i]=n%10;
        n/=10;    
        }
        }
public void wypisz(){
for(int i=0;i<dlugosc;i++){
    System.out.println(liczbatab[i]);    
}
} 
public void wpisz(){
liczbatab=null;
System.out.println("Podaj liczbe");
int n = skan.nextInt();
dlugosc=Integer.toString(n).length();
        for(int i=0;i<dlugosc;i++){
        liczbatab[i]=n%10;
        n/=10;    
        }
}

 public void pomnoz(int n)
    {
    for(int i=0;i<dlugosc;i++){
    liczbatab[i]=liczbatab[i]*n;    
}
    }
 public int silnia(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }

 }
}