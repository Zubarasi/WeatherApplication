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


    private void createEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwa miastra: ");
        String city = scanner.nextLine();
        System.out.println("Nazwa kraju: ");
        String country = scanner.nextLine();
        System.out.println("Nazwa regionu: ");
        String region = scanner.nextLine();
        System.out.println("Długość i szerokość geograficzna: ");
        float longitudeAndLattidue = scanner.nextFloat();

        // POST: /entry
        String request = String.format("{\"title\":\"%s\",\"content\":\"%s\"}", city, country, region, longitudeAndLattidue);
        System.out.println("Wysylany json: " + request);
    }

}
