package com.reto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String name = sc.nextLine();
        System.out.println("Ingresar edad: ");
        int age = sc.nextInt();
        System.out.println("Ingresar estatura: ");
        double height = sc.nextDouble();
        System.out.println("nombre: "+name +" edad: "+age+ " estatura: " + height);
    }
}
