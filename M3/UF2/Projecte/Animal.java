package com.iesebre;
import java.util.Scanner;
import  java.util.Random;

/**
 * @author Ivan OG
 * @version 2.2.3 Beta
 */
public class Animal {

    // Declarem les variables d'entorn
    Scanner sc = new Scanner(System.in);
    static String ConversaAnimal;
    static String Nom;
    static String TipusAnimal;
    static char CaracterFavorit;
    static String[] Conversa;
    boolean[] Verificacio = new boolean[7];

    void Animal() {
    }

    boolean talking() {
        Boolean[] Array = new Boolean[8];
        Conversa= new String[8];
        for(int i = 0; i < Array.length; i++){
            Array[i] = false;
        }

        boolean fi = false;
        Scanner scanner = new Scanner(System.in);
        boolean fi2 = false;
        char caracter = 0;
        char animal = 0;
        String nom = "";
        char joc = 0;
        System.out.println("Qüestionari");
        System.out.println("1. Quin tipus d'animal ets?");
        System.out.println("2. A que t'agrada jugar?");
        System.out.println("3. Quin es el teu caràcter favorit?");
        System.out.println("4. Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                "de la suma, entre el valor Unicode del primer i segon caràcter, on el valor Unicode del\n" +
                "primer creixerà fins al segon, el segon decreixerà fins primer ?");
        System.out.println("5. Juguem a fer onomatopeies?");
        System.out.println("6. Posa-li un nom");
        System.out.println("7. Podries recordar la nostra conversa?");
        System.out.println("8. Vols sortir de la conversa?");

        do {
            System.out.println("Tria una opció(1-8): ");

            Scanner sc = new Scanner(System.in);

            switch (scanner.nextLine()) {
                case "1":
                    if (Array[0] != false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 9:
                    System.out.println("Tria una lletra (A-Z)");
                    char tipus = sc.next().charAt(0);
                    TipusAnimal(tipus);
                    Array[0] = true;
                    break;

                case "2":
                    if (Array[0] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 10:
                    System.out.println("Tria el teu joc favorit: (Inserta una lletra (A-J)");
                    char esport = sc.next().charAt(0);
                    Esport(esport);

                    Array[1] = true;
                    break;

                case "3":
                    if (Array[1] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 11:
                    System.out.println("Exercici incomplet");
                    Array[2] = true;
                    break;

                case "4":
                    if (Array[2] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 12
                    System.out.println("Exercici incomplet");
                    Array[3] = true;
                    break;

                case "5":
                    if (Array[3] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 13
                    Random random = new Random();
                    System.out.println("Tria una lletra (A-Z) per formar una onomatopeia: ");
                    char ch1 = sc.next().charAt(0);
                    char ch2 = (char) (random.nextInt(26) + 'A');
                    char ch3 = sc.next().charAt(0);
                    char ch4 = (char) (random.nextInt(26) + 'A');
                    char ch5 = sc.next().charAt(0);
                    Onomatopeies(ch1,ch3,ch5);

                    Array[4] = true;
                    break;

                case "6":
                    if (Array[4] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 14
                    System.out.println("Tria un nom per posar-me:");
                    Scanner sc14 = new Scanner(System.in);
                    nom = sc14.nextLine();
                    System.out.println(nom + "... Gràcies. M'agrada aquest nom");
                    Array[5] = true;
                    break;

                case "7":
                    if (Array[5] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                    // EXERCICI 15
                    System.out.println("Exercici incomplet");
                    Array[6] = true;
                    break;

                case "8":
                    if (Array[6] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    System.out.println("Vols sortir de l'aplicació? (s/n)");
                    Scanner conv = new Scanner(System.in);
                    String conversa = conv.nextLine();
                    if (conversa.equals("S") || conversa.equals("s")) {
                        return true;
                    }
                    if (conversa.equals("N") || conversa.equals("n")) {
                        Array[7] = true;
                        break;
                    }
            }
        }
        while (!fi2);
        return true;
    }

    // Creació de mètodes

    // MÈTODE TIPUSANIMAL
    public static String TipusAnimal (char tipus){

        // Control d'entrada
        Scanner sc = new Scanner (System.in);
        while (tipus<65 || tipus>90){
            System.out.println("Has d'introduïr un caràcter entre la A i la Z");
            System.out.print("Tria una lletra (A-Z): ");
            tipus = sc.next().charAt(0);
        }
        // Exercici 1
        int difG = 'g' - tipus;
        int difS = 's' - tipus;

        if (difG >= -3 || tipus <= 'g') {
            System.out.println("Gos");
            Conversa[0]="Gos";
        } else if (difS <= -3 || tipus >= 's') {
            System.out.println("Serp");
            Conversa[0]="Serp";
        } else {
            System.out.println("Mono");
            Conversa[0]="Mono";
        }
        return Conversa[0];
    }

    // MÈTODE ESPORT
    public static String Esport (char esport){

        // Control d'entrada
        Scanner sc = new Scanner (System.in);
        while (esport<65 || esport>74) {
            System.out.println("Has d'introduïr un caràcter entre la A i la J");
            System.out.print("Tria el teu joc favorit: (Inserta una lletra (A-J): ");
            esport = sc.next().charAt(0);
        }
        // Exercici 2
        if (esport == 'A') {
            System.out.println("Pilla-pilla");
            Conversa[1]="Pilla-pilla";
        } else if (esport == 'B') {
            System.out.println("Pilota");
            Conversa[1]="Pilota";
        } else if (esport == 'C') {
            System.out.println("Saltar");
            Conversa[1]="Saltar";
        } else if (esport == 'D') {
            System.out.println("Circuit");
            Conversa[1]="Circuit";
        } else if (esport == 'E') {
            System.out.println("Córrer");
            Conversa[1]="Córrer";
        } else if (esport == 'F') {
            System.out.println("Dinàmica");
            Conversa[1]="Dinàmica";
        } else if (esport == 'G') {
            System.out.println("Vols");
            Conversa[1]="Vols";
        } else if (esport == 'H') {
            System.out.println("Amagar");
            Conversa[1]="Amagar";
        } else if (esport == 'I') {
            System.out.println("Cercar");
            Conversa[1]="Cercar";
        } else if (esport == 'J') {
            System.out.println("Estirar");
            Conversa[1]="Estirar";
        } else {
            System.out.println("La lletra seleccionada no correspon a cap joc");
        }
        return Conversa[1];
    }

    // MÈTODE ONOMATOPEIES

    /**
     * @param ch1
     * @param ch3
     * @param ch5
     * @return
     */
    public static String Onomatopeies(char ch1, char ch3, char ch5){
        // Control d'entrada
        while (ch1<65 || ch1>90 || ch3<65 || ch3>90 || ch5<65 || ch5>90){
            System.out.println("Has d'introduïr un caràcter entre la A i la Z");
            System.out.print("Tria una lletra (A-Z) per formar una onomatopeia: ");
        }
        // Variables
        int contador = 0;

        Scanner sc13 = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Tria una lletra (A-Z) per formar una onomatopeia: ");
        int torn = 0;
        while (torn != 5) {
            ch1 = sc13.next().charAt(0);
            System.out.println(ch1);
            char ch2 = (char) (random.nextInt(26) + 'A');
            System.out.println(ch2);
             ch3 = sc13.next().charAt(0);
            System.out.println(ch3);
            String str = new StringBuilder().append(ch1).append(ch2).append(ch3).toString();
            char vocal = str.charAt(1);

            if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                System.out.println("La combinació " + str + " es una onomatopeia");
                ++contador;
            } else
                System.out.println("La combinació " + str + " no es una onomatopeia");

            char ch4 = (char) (random.nextInt(26) + 'A');
            System.out.println(ch4);
            ch5 = sc13.next().charAt(0);
            System.out.println(ch5);
            char ch6 = (char) (random.nextInt(26) + 'A');
            System.out.println(ch6);
            String str2 = new StringBuilder().append(ch4).append(ch5).append(ch6).toString();
            char vocal2 = str2.charAt(1);

            if (vocal2 == 'A' || vocal2 == 'E' || vocal2 == 'I' || vocal2 == 'O' || vocal2 == 'U') {
                System.out.println("La combinació " + str + " és una onomatopeia");
                ++contador;
            } else {
                System.out.println("La combinació " + str2 + " no és una onomatopeia");
            }
            ++torn;
        }
        System.out.println("Has realitzat " + contador + " onomatopeies" );

        return Conversa[4];
    }
}
