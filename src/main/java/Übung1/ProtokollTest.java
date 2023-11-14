package Übung1;

public class ProtokollTest {

    private String protokoll = "";

    public void add(String text){
        protokoll += text + "\n";
    }

    public String getProtokoll() {
        return protokoll;
    }

    public static void main(String[] args) {
        ProtokollTest p = new ProtokollTest();
    }
}
