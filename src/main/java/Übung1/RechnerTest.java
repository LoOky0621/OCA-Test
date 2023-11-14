package Übung1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RechnerTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ProtokollTest Pro = new ProtokollTest();


        System.out.println("----- TaschenRechner v0.1 ----------");

        System.out.println("Addition");
        int zahl1 = eingabe(reader);
        int zahl2 = eingabe(reader);
        Rechner R1 = new Rechner(Pro);
        R1.setSumme(zahl1, zahl2);
        System.out.println("Summe: " + R1.getSumme());

        System.out.println("Multiplikation");
        zahl1 = eingabe(reader);
        zahl2 = eingabe(reader);
        Rechner R2 = new Rechner(Pro);
        R2.setMultiplikation(zahl1, zahl2);
        System.out.println("Produkt: " + R2.getMultiplikation());

        System.out.println("Subtraktion");
        zahl1 = eingabe(reader);
        zahl2 = eingabe(reader);
        Rechner R3 = new Rechner(Pro);
        R3.setSubtraktion(zahl1, zahl2);
        System.out.println("Differenz: " + R3.getSubtraktion());

        System.out.println("Division");
        zahl1 = eingabe(reader);
        zahl2 = eingabe(reader);
        Rechner R4 = new Rechner(Pro);
        R4.setDivision(zahl1, zahl2);
        System.out.println("Quotient: " + R4.getDivision());

        System.out.println("Protokoll:\n" + Pro.getProtokoll());
        System.out.println("Bye");
    }

    public static int eingabe(BufferedReader reader) throws IOException {
        System.out.print("Bitte Zahl eingeben:");
        return Integer.parseInt(reader.readLine());
    }
}