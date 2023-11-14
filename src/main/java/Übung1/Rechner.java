package Übung1;

public class Rechner {

    private int summe;
    private float division;
    private int multiplikation;
    private int subtraktion;
    private ProtokollTest protokollInstanz;

    public Rechner(ProtokollTest protokollInstanz) {
        this.protokollInstanz = protokollInstanz;
    }

    public int getSumme() {

        return summe;
    }

    public void setSumme(int zahl1, int zahl2) {

        this.summe = zahl1 + zahl2;
        protokollInstanz.add(zahl1 + " + " + zahl2);
    }

    public float getDivision() {
        return division;
    }

    public void setDivision(float zahl1, float zahl2) {

        this.division = zahl1 / zahl2;
        protokollInstanz.add(zahl1 + " / " + zahl2);
    }

    public int getMultiplikation() {
        return multiplikation;
    }

    public void setMultiplikation(int zahl1, int zahl2) {

        this.multiplikation = zahl1 * zahl2;
        protokollInstanz.add(zahl1 + " * " + zahl2);
    }

    public int getSubtraktion() {

        return subtraktion;
    }

    public void setSubtraktion(int zahl1, int zahl2) {

        this.subtraktion = zahl1 - zahl2;
        protokollInstanz.add(zahl1 + " - " + zahl2);
    }
}