package Würfelbecher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Würfeln {
    public static void main(String[] args) throws IOException {
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------Würfelbecher v0.1--------");

        int anzahl = eingabe1(eingabe);
        int bereich = eingabe2(eingabe);

        int[] zähler = new int[bereich + 1];

        würfelnUndZählen(anzahl, bereich, zähler);

        ausgabeHäufigkeit(zähler, bereich);
    }

    public static void würfelnUndZählen(int anzahl, int bereich, int[] zähler) {
        for (int i = 1; i <= anzahl; i++) {
            Random r = new Random();
            int ergebnis = r.nextInt(bereich) + 1;
            System.out.println(i + ".Wurf: " + ergebnis);
            zähler[ergebnis]++;
        }
    }

    public static void ausgabeHäufigkeit(int[] zähler, int bereich) {
        for (int j = 1; j <= bereich; j++) {
            System.out.println("Zahl " + j + " kam " + zähler[j] + " mal vor.");
        }
    }

    public static int eingabe1(BufferedReader reader) throws IOException {
        System.out.print("Bitte Würfelanzahl eingeben: ");
        return Integer.parseInt(reader.readLine());
    }

    public static int eingabe2(BufferedReader reader) throws IOException {
        System.out.print("Bitte Würfelbereich eingeben: ");
        return Integer.parseInt(reader.readLine());
    }
}
