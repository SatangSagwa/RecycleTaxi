package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Hej och Välkommen till Återvinningstaxin! \n" + "Vänligen välj ett av följande: \n" + "1. Logga in \n" + "2. Skapa nytt konto" );

    Scanner sc = new Scanner (System.in);

    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Vänligen ange användarnamn: ");
            String username = sc.next();
            System.out.println("Vänligen ange läsenord: ");
            String password = sc.next
    }

    }
}