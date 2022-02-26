package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    public void run() {
        System.out.println("Aplikacja jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodać nowy wpis"); // todo Location
            System.out.println("2. Odczytać wszystkie wpisy"); // todo Location
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

    private void createEntry() { // todo rename to createLocation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwa miastra: "); // todo miasta
        String city = scanner.nextLine();
        System.out.println("Nazwa kraju: ");
        String country = scanner.nextLine();
        System.out.println("Nazwa regionu: ");
        String region = scanner.nextLine();
        System.out.println("Długość i szerokość geograficzna: "); // todo 2 separated values
        float longitudeAndLattidue = scanner.nextFloat();

        // POST: /entry
        // todo in progress...
        String request = String.format("{\"title\":\"%s\",\"content\":\"%s\"}", city, country, region, longitudeAndLattidue);
        System.out.println("Wysylany json: " + request);
        // todo use new LocationController
    }
}
