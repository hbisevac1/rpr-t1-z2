package com.company;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int suma = 0;
        do{
            suma=suma+(broj%10);
            broj/=10;
        }while(broj!=0);
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite cijeli broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n= ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%sumaCifara(i) == 0) System.out.println(i);
        }

    }
}
