package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    public void run() {
        System.out.println("Aplikacja jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Dodać nowy wpis");
        System.out.println("2. Odczytać wszystkie wpisy");
        System.out.println("0. Zamknąć aplikację");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                return;
        }
    }
}

}
