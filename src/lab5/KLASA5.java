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
public class KLASA5 {    
private int stos[];
private int wskaznik=0;
Scanner skan = new Scanner(System.in);

public KLASA5(int rozmiar) {
stos = new int[rozmiar];
}
public void push(){
if(wskaznik<stos.length){    
System.out.println("Podaj liczbe dla "+wskaznik+" elementu stosu");
stos[wskaznik]=skan.nextInt();
wskaznik++;
}else System.out.println("Stos jest pełny"); 
}

public void pop(){
if(wskaznik!=0){
stos[wskaznik]=0;
wskaznik--;
}else System.out.println("Stos jest pusty");    
}

public void pokaz(){
for(int i=0;i<stos.length;i++){
System.out.println("Stos["+i+"] = "+stos[i]);    
}    
}

}
