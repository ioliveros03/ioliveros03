package com.iesebre;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Selecciona amb qui vols conversar: ");
            System.out.println("  - Animal");
            System.out.print("Opció: ");
            switch (scanner.nextLine()) {
                case "Animal" -> {
                    Animal animal = new Animal();
                    finish = animal.talking();
                }
            }
        } while (!finish);
    }
}
